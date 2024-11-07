package PPJ11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task02 {
    public static void main(String[] args) {
        int[][] tab = losowaTablica();

        System.out.println("Tablica z duplikatami:");
        for (int[] ints : tab) {
            System.out.println(Arrays.toString(ints));
        }

        int[][] tablicaBezDuplikatow = bezDuplikatow(tab);

        System.out.println();
        System.out.println("Tablica bez duplikatow:");
        for (int[] ints : tablicaBezDuplikatow) {
            System.out.println(Arrays.toString(ints));
        }    }

    public static int[][] losowaTablica() {
        Random rand = new Random();
        int wiersze = rand.nextInt(5) + 2;
        int[][] tab = new int[wiersze][];

        for (int i = 0; i < wiersze; i++) {
            int kolumny = rand.nextInt(5) + 2;
            tab[i] = new int[kolumny];

            for (int j = 0; j < kolumny; j++) {
                tab[i][j] = rand.nextInt(10);
            }
        }
        return tab;
    }

    public static int[][] bezDuplikatow(int[][] tab) {
        int[][] tablicaBezDuplikatow = new int[tab.length][];

        for (int i = 0; i < tab.length; i++) {
            Set<Integer> unikalneWartosci = new HashSet<>();
            for (int j = 0; j < tab[i].length; j++) {
                unikalneWartosci.add(tab[i][j]);
            }
            tablicaBezDuplikatow[i] = new int[unikalneWartosci.size()];
            int index = 0;
            for (int wartosc : unikalneWartosci) {
                tablicaBezDuplikatow[i][index++] = wartosc;
            }
        }
        return tablicaBezDuplikatow;
    }
}