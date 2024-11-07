package PPJ10.Poprawa;

public class Walec {
    private int promien;
    private int wysokosc;

    public Walec(int promien, int wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    public void show() {
        double polePodstawy = Math.PI * Math.pow(promien, 2);
        double objetoscWalca = polePodstawy * wysokosc;

        System.out.println("Pole powierzchni: " + polePodstawy);
        System.out.println("Objetosc walca: " + objetoscWalca);
    }

    public static void main(String[] args) {
        Walec walec = new Walec(100, 100);
        walec.show();
    }
}