package PPJ11;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        int size = 5;

        Random rand = new Random();
        int invalidCases = 0;

        while (invalidCases < 20) {
            int x = rand.nextInt((int) (1.2 * size + 0.2 * size)) - (int) (0.2 * size);
            int y = rand.nextInt((int) (1.2 * size + 0.2 * size)) - (int) (0.2 * size);

            if (sprawdzWspolrzedne(x, y, size)) {
                System.out.println("Wspolrzedne (" + x + ", " + y + ") zgadzaja sie.");
            } else {
                System.out.println("Coordinates outside array range: (" + x + ", " + y + ")");
                invalidCases++;
            }
        }
    }
    public static boolean sprawdzWspolrzedne(int x, int y, int size) {
        return x >= 0 && x < size && y >= 0 && y < size;
    }
}