package PPJ06.Poprawa;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(2);
        }

        int zero = 0;
        int jeden = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0){
                zero++;
            }else {
                jeden++;
            }
        }

        System.out.println("Tyle zer: " + zero);
        System.out.println("Tyle jedynek: " + jeden);
    }
}