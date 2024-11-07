package PPJ09;

/*Utwórz program odczytujący wprowadzoną z klawiatury wartość rzeczywistą wyrażającą kwotę w PLN,
a następnie wyświetlający na ekranie ilość i rodzaj bilonu konieczny do wydania tej kwoty. Np. dla wartości 1.75 zl otrzymamy:

        1 * 1 zl

        1 * 50 gr

        1 * 20 gr

        1 * 5 gr*/

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz wartosc w PLN: ");
        double wartosc = scanner.nextDouble();

        int temp = (int) (wartosc * 100);

        int zliczanie = 0;
        int moneta = 500;
        while (temp >= moneta) {
            zliczanie++;
            temp -= moneta;
        }
        if (zliczanie != 0)
            System.out.println(zliczanie + " * " + moneta / 100 + "zl");

        zliczanie = 0;
        moneta = 200;
        while (temp >= moneta) {
            zliczanie++;
            temp -= moneta;
        }
        if (zliczanie != 0)
            System.out.println(zliczanie + " * " + moneta / 100 + "zl");

        zliczanie = 0;
        moneta = 100;
        while (temp >= moneta) {
            zliczanie++;
            temp -= moneta;
        }
        if (zliczanie != 0)
            System.out.println(zliczanie + " * " + moneta / 100 + "zl");

        zliczanie = 0;
        moneta = 50;
        while (temp >= moneta) {
            zliczanie++;
            temp -= moneta;
        }
        if (zliczanie != 0)
            System.out.println(zliczanie + " * " + moneta + "gr");

        zliczanie = 0;
        moneta = 20;
        while (temp >= moneta) {
            zliczanie++;
            temp -= moneta;
        }
        if (zliczanie != 0)
            System.out.println(zliczanie + " * " + moneta + "gr");

        zliczanie = 0;
        moneta = 10;
        while (temp >= moneta) {
            zliczanie++;
            temp -= moneta;
        }
        if (zliczanie != 0)
            System.out.println(zliczanie + " * " + moneta + "gr");

        zliczanie = 0;
        moneta = 5;
        while (temp >= moneta) {
            zliczanie++;
            temp -= moneta;
        }
        if (zliczanie != 0)
            System.out.println(zliczanie + " * " + moneta + "gr");

        zliczanie = 0;
        moneta = 1;
        while (temp >= moneta) {
            zliczanie++;
            temp -= moneta;
        }
        if (zliczanie != 0)
            System.out.println(zliczanie + " * " + moneta + "gr");

    }
}
