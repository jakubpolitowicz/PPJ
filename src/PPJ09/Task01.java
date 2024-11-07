package PPJ09;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wartosc boku A1: ");
        int aa1 = scanner.nextInt();
        System.out.print("Podaj wartosc boku A1: ");
        int ab1 = scanner.nextInt();
        System.out.print("Podaj wartosc boku B1: ");
        int ba1 = scanner.nextInt();
        System.out.print("Podaj wartosc boku B1: ");
        int bb1 = scanner.nextInt();
        System.out.print("Podaj wartosc boku A2: ");
        int aa2 = scanner.nextInt();
        System.out.print("Podaj wartosc boku A2: ");
        int ab2 = scanner.nextInt();
        System.out.print("Podaj wartosc boku A2: ");
        int ba2 = scanner.nextInt();
        System.out.print("Podaj wartosc boku B2: ");
        int bb2 = scanner.nextInt();

        int czescWspolnaBokuA1 = Math.max(aa1, ba1);
        int czescWspolnaBokuB1 = Math.max(ab1, bb1);
        int czescWspolnaBokuA2 = Math.min(aa2, ba2);
        int czescWspolnaBokuB2 = Math.min(ab2, bb2);

        if (czescWspolnaBokuA1 < czescWspolnaBokuA2 && czescWspolnaBokuB1 < czescWspolnaBokuB2) {
            int czescWspolna = (czescWspolnaBokuA2 - czescWspolnaBokuA1) * (czescWspolnaBokuB2 - czescWspolnaBokuB1);
            System.out.println("Wartosc pola powierzchni czesci wspolnej A i B: " + czescWspolna);
        } else {
            System.out.println("Prostokaty A i B nie maja wspolnej czesci!");
        }


    }
}
