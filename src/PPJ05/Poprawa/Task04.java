package PPJ05.Poprawa;

public class Task04 {
    public static void main(String[] args) {

        System.out.println("Pierwsze 10 elementow :");
        for (int n = 0; n < 10; n++) {
            double element = 1.0 / Math.pow(2, n);
            System.out.println("Element " + (n + 1) + ": " + element);
        }
    }
}