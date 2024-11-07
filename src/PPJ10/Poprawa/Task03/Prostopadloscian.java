package PPJ10.Poprawa.Task03;

public class Prostopadloscian extends Prostokat {
    private int c;

    public Prostopadloscian(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public Prostopadloscian() {
    }

    public void show() {
        int a = getA();
        int b = getB();
        int polePowierzchniCalkowitej = 2 * (a * b + b * c + a * c);
        int objetoscWalca = a * b * c;

        System.out.println("Pole powierzchni: " + polePowierzchniCalkowitej);
        System.out.println("Objetosc Walca: " + objetoscWalca);
    }
}