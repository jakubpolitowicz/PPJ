package PPJ05.Poprawa;

public class Task05 {
    public static void main(String[] args) {

        int wrt = 3;
        System.out.println("Pierwsze 10 elementów:");

        for (int n = 1; n <= 10; n++) {
            int element = n * wrt;
            System.out.println("Element " + n + ": " + element);
        }
    }
}