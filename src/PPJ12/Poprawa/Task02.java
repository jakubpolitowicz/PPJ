package PPJ12.Poprawa;

public class Task02 {
    public static void main(String[] args) {
        try {
            CiagnikSiodlowy ciagnik = new CiagnikSiodlowy("Czarny", 2, 4000);
            ciagnik.rozpocznijJazde();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Pojazd {
    String color;

    public Pojazd(String color) {
        this.color = color;
    }
}

class PojazdKolowy extends Pojazd {
    private final int iloscOsi;

    public PojazdKolowy(String color, int iloscOsi) {
        super(color);
        this.iloscOsi = iloscOsi;
    }

    public int getIloscOsi() {
        return iloscOsi;
    }
}

class CiagnikSiodlowy extends PojazdKolowy {
    private final int masa;

    public CiagnikSiodlowy(String color, int iloscOsi, int masa) {
        super(color, iloscOsi);
        this.masa = masa;
    }

    public void rozpocznijJazde() throws Exception {
        int naciskNaOs = masa / getIloscOsi();
        if (naciskNaOs > 11) {
            throw new Exception("Jazda niebezpieczna, odmowa uruchomienia silnika");
        }
        System.out.println("Ciagnik siodlowy gotowy do jazdy!");
    }
}