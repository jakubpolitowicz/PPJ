package PPJ10.Poprawa.Task04;

public class Osoba {
    private String imie;

    public Osoba(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public String wyswietl() {
        return "Imie: " + imie;
    }
}