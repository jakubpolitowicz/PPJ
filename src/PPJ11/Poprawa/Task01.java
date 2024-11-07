package PPJ11.Poprawa;

public class Task01 {
    public static void main(String[] args) {

        Drzewo1[] las = {
                new Drzewo1(true, 4, "stare"),
                new Drzewo1Lisciaste(false, 2, "mlode", 0),
                new Drzewo1Iglaste(true,8, "stare", 8, 1.2),
                new Drzewo1Owocowe(false, 3, "stare", "wisnia")
        };

        for (Drzewo1 drzewo : las) {
            System.out.println(drzewo);
        }
    }
}

class Drzewo1 {
    boolean wiecznieZielone;
    int wysokosc;
    String przekrojDrzewa;

    public Drzewo1(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    @Override
    public String toString() {
        return wiecznieZielone + ", " + wysokosc + ", " + przekrojDrzewa;
    }
}

class Drzewo1Iglaste extends Drzewo1 {
    int iloscIgiel;
    double dlugoscSzyszki;

    public Drzewo1Iglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgiel, double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + iloscIgiel + ", " + dlugoscSzyszki;
    }
}

class Drzewo1Lisciaste extends Drzewo1 {
    int ksztaltLiscia;

    public Drzewo1Lisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + ksztaltLiscia;
    }
}

class Drzewo1Owocowe extends Drzewo1 {
    String nazwaOwoca;

    public Drzewo1Owocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + nazwaOwoca;
    }
}