package PPJ09.Poprawa.Task03;

public class Main {
    public static void main(String[] args) {
        Osoba osoba = new Osoba();

        osoba.imie = "Jan";
        osoba.nazwisko = "Nowak";
        osoba.rokUrodzenia = 1991;

        System.out.println("Imie: " + osoba.imie);
        System.out.println("Nazwisko: " + osoba.nazwisko);
        System.out.println("Rok urodzenia: " + osoba.rokUrodzenia);
    }
}