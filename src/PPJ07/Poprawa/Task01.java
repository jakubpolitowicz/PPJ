package PPJ07.Poprawa;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr1 = new int[random.nextInt(10)];
        int[] arr2 = new int[random.nextInt(10)];
        int[] arr3 = new int[random.nextInt(10)];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = random.nextInt(100);
        }

        int[][] table = {arr1, arr2, arr3};
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}