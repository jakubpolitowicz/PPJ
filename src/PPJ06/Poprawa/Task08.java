package PPJ06.Poprawa;

import java.util.Random;

public class Task08 {
    public static void main(String[] args) {
        char[] tab = new char[10];

        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = (char)(random.nextInt(26) + 'A');
        }

        System.out.print("Tablica: ");
        for ( char znak: tab){
            System.out.print(znak +" ");
        }
        System.out.println();
        System.out.print("Lustrzane odbicie: ");
        for (int i = tab.length - 1; i >= 0 ; i--) {
            System.out.print(tab[i] + " ");
        }
    }
}