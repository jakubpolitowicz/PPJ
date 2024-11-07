package PPJ04;

public class Task03 {
    public static void main(String[] args) {
        Kwadrat k = new Kwadrat(5);
        k.show();
    }
}

class Kwadrat {
    int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    public void show() {
        System.out.println("Kwadrat: " + '\n' +
                "* Bok kwadratu = " + bok + '\n' +
                "* Pole powierzchni = " + Math.pow(bok, 2) + '\n' +
                "* Objetosc = " + Math.pow(bok, 3));
    }
}
