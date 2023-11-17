/**
 * @author Politowicz Jakub S26211
 */

package zad2;


public class Purchase {
    private final String customerId;
    private final String name;
    private final String product;
    private final double price;
    private final double quantity;

    public Purchase(String customerId, String name, String product, double price, double quantity) {
        this.customerId = customerId;
        this.name = name;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return customerId + ";" + name + ";" + product + ";" + price + ";" + quantity;
    }
}
