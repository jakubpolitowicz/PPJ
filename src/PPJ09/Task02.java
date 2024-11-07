package PPJ09;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar znaku: ");
        int size = scanner.nextInt();

        for (int i = -size; i <= size; i++) {
            int a = Math.abs(i);
            for (int j = 0; j < 2 * size + 1; j++) {
                if (j < a || j > (2 * size - a)) {
                    System.out.print(". ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
