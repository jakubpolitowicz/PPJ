package PPJ10.Poprawa.Task03;

public class Graniastoslup extends Trojkat {
    private int H;

    public Graniastoslup(int a, int H) {
        super(a);
        this.H = H;
    }

    public Graniastoslup() {
    }

    public void show() {
        double polePowierzchniCalkowitej = 2 * getPolePowierzchniTrojkata() + 3 * getA() * H;
        double objetoscGraniastoslupa = getPolePowierzchniTrojkata() * H;
        System.out.println("Pole powierzchni: " + polePowierzchniCalkowitej);
        System.out.println("Objetosc graniastoslupa: " + objetoscGraniastoslupa);
    }
}