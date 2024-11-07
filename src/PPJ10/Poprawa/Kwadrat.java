package PPJ10.Poprawa;

public class Kwadrat {
    private int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    public void show() {
        double polePowierzchni = Math.pow(bok, 2);
        double objetoscSzescianu = Math.pow(bok, 3);

        System.out.println("Pole powierzchni kwadratu = " + polePowierzchni);
        System.out.println("Objetosc szescianu z tego kwadratu = " + objetoscSzescianu);
    }

    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(5);
        kwadrat.show();
    }
}