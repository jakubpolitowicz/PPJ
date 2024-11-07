package PPJ10.Poprawa.Task03;

public class Trojkat {
    private int a;

    public Trojkat(int a) {
        this.a = a;
    }

    public Trojkat() {
    }

    public int getA() {
        return a;
    }

    public double getPolePowierzchniTrojkata(){
        return ((int)Math.pow(a, 2) * Math.sqrt(3))/4;
    }

    public void show() {
        System.out.println("Pole powierzchni: " + getPolePowierzchniTrojkata());
    }
}
