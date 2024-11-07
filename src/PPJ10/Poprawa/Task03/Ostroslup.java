package PPJ10.Poprawa.Task03;

public class Ostroslup extends Trojkat {
    private int H;
    private int h;

    public Ostroslup(int a, int H, int h) {
        super(a);
        this.H = H;
        this.h = h;
    }

    public Ostroslup() {
    }

    public void show() {
        double polePowierzchniCalkowitej = getPolePowierzchniTrojkata() + 3 * getA() * h;
        System.out.println("Pole powierzchni calkowitej: " + polePowierzchniCalkowitej);
        double objetoscOstroslupa = (double) 1 / 3 * polePowierzchniCalkowitej * H;
        System.out.println("Objetosc ostroslupa: " + objetoscOstroslupa);
    }
}
