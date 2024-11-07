package PPJ10.Poprawa.Task03;

public class Prostokat {
    private int a;
    private int b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Prostokat() {
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void show() {
        System.out.println("Prostokat o powierzchni:" + a * b);
    }
}