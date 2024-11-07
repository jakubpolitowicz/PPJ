package PPJ12;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task02 {
    public static void main(String[] args) {
        String filePath = "C:/Users/jakub/Desktop/zad1.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linia;
            double sum = 0;
            while ((linia = br.readLine()) != null) {
                String[] liczby = linia.split(" ");
                for (String liczba : liczby) {
                    try {
                        double parsowanaLiczba = Double.parseDouble(liczba);
                        sum += parsowanaLiczba;
                    } catch (NumberFormatException e) {
                        System.err.println("Blad parsowania liczby: " + liczba);
                    }
                }
            }
            System.out.println("Suma liczb z pliku " + filePath + ": " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}