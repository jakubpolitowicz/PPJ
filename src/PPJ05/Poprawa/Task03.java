package PPJ05.Poprawa;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a;

        //while
        System.out.println("While:");
        a = 0;
        while (a != 1 && a != 2) {
            System.out.println("Wybierz 1 lub 2:");
            a = s.nextInt();
        }
        System.out.println("Wybrales: " + a);

        //do-while
        System.out.println("do-while:");
        do {
            System.out.println("Wybierz 1 lub 2:");
            a = s.nextInt();
        } while (a != 1 && a != 2);
        System.out.println("Wybrales: " + a);
    }
}