/**
 *
 * @author Politowicz Jakub S26211
 *
 */

package zad2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomersPurchaseSortFind {
    private final List<Purchase> purchases = new ArrayList<>();

    public void readFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                if (data.length == 5) {
                    String customerId = data[0];
                    String name = data[1];
                    String product = data[2];
                    double price = Double.parseDouble(data[3]);
                    double quantity = Double.parseDouble(data[4]);
                    purchases.add(new Purchase(customerId, name, product, price, quantity));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showSortedBy(String sortBy) {
        if (sortBy.equals("Nazwiska")) {
            purchases.sort(Comparator.comparing(Purchase::getName)
                    .thenComparing(Purchase::getCustomerId));
            System.out.println("Nazwiska");
            purchases.forEach(System.out::println);
        } else if (sortBy.equals("Koszty")) {
            purchases.sort(Comparator.comparing(Purchase::getTotalCost)
                    .reversed()
                    .thenComparing(Purchase::getCustomerId));
            System.out.println('\n' + "Koszty");
            purchases.forEach(purchase ->
                    System.out.println(purchase + " (koszt: " + purchase.getTotalCost() + ")"));
        }
    }

    public void showPurchaseFor(String customerId) {
        System.out.println('\n' + "Klient " + customerId);
       purchases.stream().filter(purchase -> purchase.getCustomerId()
                        .equals(customerId))
               .sorted(Comparator.comparing(Purchase::getProduct).reversed())
                .forEach(System.out::println);
    }
}