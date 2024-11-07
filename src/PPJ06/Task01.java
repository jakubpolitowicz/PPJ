package PPJ06;

public class Task01 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println(rectangle);
        Cuboid cuboid = new Cuboid(1, 2,3);
        System.out.println(cuboid);
    }
}

class Cuboid extends Rectangle {
    private int c;

    public Cuboid(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public int getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Pole powierzchni prostopadloscianu = "
                + 2 * (getA() * getB() + getA() * getC() + getB() * getC()) + '\n'
                + "Objetosc wynosi prostopadloscianu = " + getA() + getB() + getC();
    }
}

class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Pole powierzchni prostokata = " + getA() * getB();
    }
}
