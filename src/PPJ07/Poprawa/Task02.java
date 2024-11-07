package PPJ07.Poprawa;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] tab = new int[8][8];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[] pierwszaPrzekatna = new int[10];
        int[] drugaPrzekatna = new int[10];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (i == j) {
                    pierwszaPrzekatna[tab[i][j]]++;
                }
                if (i + j == tab.length - 1) {
                    drugaPrzekatna[tab[i][j]]++;
                }
            }
        }

        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (pierwszaPrzekatna[i] + drugaPrzekatna[i] == 3) {
                System.out.println("Liczba " + i + " wystepuje trzy razy");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Nie wystepuje");
        }
    }
}