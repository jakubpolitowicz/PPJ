package PPJ10.Poprawa;

class Pojazd {
    private String color;

    public Pojazd(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String wyswietl() {
        return "Kolor pojazdu: " + color;
    }
}

class PojazdKolowy extends Pojazd {
    private int iloscOsi;

    public PojazdKolowy(String color, int iloscOsi) {
        super(color);
        this.iloscOsi = iloscOsi;
    }

    public int getIloscOsi() {
        return iloscOsi;
    }

    @Override
    public String wyswietl() {
        return super.wyswietl() + ", Ilość osi: " + iloscOsi;
    }
}

class CiagnikSiodlowy extends PojazdKolowy {
    private double masa;

    public CiagnikSiodlowy(String color, int iloscOsi, double masa) {
        super(color, iloscOsi);
        this.masa = masa;
    }

    public double getMasa() {
        return masa;
    }

    public void rozpocznijJazde() {
        double naciskNaOs = masa / getIloscOsi();
        if (naciskNaOs > 11) {
            System.out.println("Odmowa uruchomienia silnika");
        } else {
            System.out.println("Można uruchomić silnik");
        }
    }

    @Override
    public String wyswietl() {
        return super.wyswietl() + ", Masa: " + masa + " ton";
    }
}

public class Task05 {
    public static void main(String[] args) {
        Pojazd pojazd = new Pojazd("Bialy");
        PojazdKolowy pojazdKolowy = new PojazdKolowy("Czarny", 4);
        CiagnikSiodlowy ciagnikSiodlowy = new CiagnikSiodlowy("Niebieski", 2, 20);

        System.out.println(pojazd.wyswietl());
        System.out.println(pojazdKolowy.wyswietl());
        System.out.println(ciagnikSiodlowy.wyswietl());
        ciagnikSiodlowy.rozpocznijJazde();
    }
}