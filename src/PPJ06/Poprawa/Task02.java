package PPJ06.Poprawa;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(2);
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ", ");
        }
    }
}