package PPJ04.Poprawa;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Podaj numer miesiaca (1-styczen, 12-grudzien): ");
        int m = s.nextInt();

        System.out.print("Podaj dzien: ");
        int d = s.nextInt();

        String poraRoku;
        switch (m) {
            case 3:
                if (d >= 21) {
                    poraRoku = "wiosna";
                } else {
                    poraRoku = "zima";
                }
                break;
            case 4:
            case 5:
                poraRoku = "wiosna";
                break;
            case 6:
                if (d >= 21) {
                    poraRoku = "lato";
                } else {
                    poraRoku = "wiosna";
                }
                break;
            case 7:
            case 8:
                poraRoku = "lato";
                break;
            case 9:
                if (d >= 23) {
                    poraRoku = "jesien";
                } else {
                    poraRoku = "lato";
                }
                break;
            case 10:
            case 11:
                poraRoku = "jesien";
                break;
            case 12:
                if (d >= 22) {
                    poraRoku = "zima";
                } else {
                    poraRoku = "jesien";
                }
                break;
            case 1:
            case 2:
                poraRoku = "zima";
                break;
            default:
                poraRoku = "Nieprawidlowy miesiac";
                break;
        }
        System.out.println("Pora roku dla podanej daty to: " + poraRoku);
    }
}