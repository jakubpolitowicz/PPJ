package PPJ08;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoj numer indeksu:");
        int numerIndeksuStudenta = scanner.nextInt();
        int suma = 0;

        for (int i = 0; i < numerIndeksuStudenta; i++) {
            suma += i;
        }
        System.out.println("Suma numeru ideksu studenta wynosi: " + suma);

    }
}
