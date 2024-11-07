package PPJ12.Poprawa;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        int[][] tab = new int[3][3];

        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = rand.nextInt(6);
            }
        }

        System.out.println("Tablica:");
        for (int[] ints : tab) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        try {
            sprawdzTablice(tab);
            System.out.println("Tablica spelnia wymagania.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void sprawdzTablice(int[][] tab) throws Exception {
        int n = tab.length;
        int errorCount = 0;
        String[] errors = new String[n * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && tab[i][j] != 0) {
                    errors[errorCount] = "[" + i + "," + j + "]";
                    errorCount++;
                }
            }
        }

        if (errorCount > 0) {
            String error = "Tablica nie spelnia wymagan, bledy na pozycjach: ";
            for (int i = 0; i < errorCount; i++) {
                error += errors[i];
                if (i < errorCount - 1) {
                    error += ", ";
                }
            }
            throw new Exception(error);
        }
    }
}