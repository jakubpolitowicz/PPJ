package PPJ06.Poprawa;

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {

        Random random = new Random();

        double[] tab = new double[10];

        //1
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);
        }

        //2
        System.out.println("Zawartosc tabeli:");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ", ");
        }

        System.out.println();
        //3
        System.out.println("Zawartosc tabeli parzystych indeksow:");
        for (int i = 0; i < tab.length; i++) {
            if (i % 2 ==0) {
                System.out.print(tab[i] + ", ");
            }
        }

        System.out.println();
        //4
        System.out.println("Zawartosc tabeli mozliwa to konwertowania:");
        for (int i = 0; i < tab.length; i++) {
            int naInt = (int) tab[i];
            System.out.print(naInt + ", ");
        }
    }
}