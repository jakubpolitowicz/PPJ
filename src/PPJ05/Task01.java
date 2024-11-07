package PPJ05;

public class Task01 {
    public static void main(String[] args) {
        Point2D point = new Point2D(3.0, 4.0);

        System.out.println(point.get());

        point.set(5.0, 6.0);

        System.out.println(point.get());
    }
}

class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void set(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    public String get() {
        return '\n' + String.valueOf(x)
                + '\n' + String.valueOf(y) + "\n1";
    }
}
