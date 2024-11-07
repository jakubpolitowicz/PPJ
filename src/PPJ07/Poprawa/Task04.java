package PPJ07.Poprawa;

import java.util.Arrays;
import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] tab = new int[10][10];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(tab[i]));
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            bubbleSort(tab[i]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(tab[i]));
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}