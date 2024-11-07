package PPJ08.Poprawa;

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] tab1 = new int[random.nextInt(10)];
        int[] tab2 = new int[random.nextInt(10)];

        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = random.nextInt(10);
        }
        System.out.print("Tabel 1: ");
        for (int a : tab1) {
            System.out.print(a + ", ");
        }
        System.out.println();

        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = random.nextInt(10);
        }

        System.out.print("Tabel 2: ");
        for (int b : tab2) {
            System.out.print(b + ", ");
        }
        System.out.println();

        int[] tabeleLaczone = tabLaczona(tab1, tab2, -1);

        System.out.print("Tabel laczona: ");
        for (int i = 0; i < tabeleLaczone.length; i++) {
            System.out.print(tabeleLaczone[i]);
            if (i < tabeleLaczone.length - 1) {
                System.out.print(", ");
            }
        }

    }

    private static int[] tabLaczona(int[] tab1, int[] tab2, int n) {
        if (n < 0) {
            int minLength = Math.min(tab1.length, tab2.length);
            int[] sumTablic = new int[minLength];

            for (int i = 0; i < minLength; i++) {
                sumTablic[i] = tab1[i] + tab2[i];
            }
            return sumTablic;
        } else if (n > 0) {
            int maxLength = Math.max(tab1.length, tab2.length);
            int count = 0;
            for (int i = 0; i < maxLength; i++) {
                if (i >= tab1.length || i >= tab2.length) {
                    count++;
                }
            }
            int[] paryTab = new int[count];
            count = 0;
            for (int i = 0; i < maxLength; i++) {
                if (i >= tab1.length || i >= tab2.length) {
                    if (i < tab1.length) {
                        paryTab[count++] = tab1[i];
                    } else {
                        paryTab[count++] = tab2[i];
                    }
                }
            }
            return paryTab;
        } else {
            return null;
        }
    }
}