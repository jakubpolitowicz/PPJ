package PPJ10;

public class Task02 {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        int[] y = {9,8,7,6,5};

        int maxX = Integer.MAX_VALUE;
        int maxY = Integer.MAX_VALUE;
        int minX = Integer.MIN_VALUE;
        int minY = Integer.MIN_VALUE;

        for (int i = 0; i < x.length; i++) {
            minX = Math.min(minX, x[i]);
            minY = Math.min(minY, y[i]);
            maxX = Math.max(maxX, x[i]);
            maxY = Math.max(maxY, y[i]);
        }

        int centerX = (minX + maxX) / 2;
        int centerY = (minY + maxY) / 2;

        int width = maxX - minX;
        int height = maxY - minY;

        System.out.println("Wspolrzedne srodka: " + centerX + ", " + centerY);
        System.out.println("Szerokosc prostokata: " + width);
        System.out.println("Wysokosc prostokata: " + height);
    }
}