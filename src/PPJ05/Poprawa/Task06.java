package PPJ05.Poprawa;

public class Task06 {
    public static void main(String[] args) {

        int a = -1500;
        for (int i = a; i <= 1500; i++) {
            if (i % 2 == 0 && i % 3 == 0)
            System.out.print(i + " ");
        }
    }
}