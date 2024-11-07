package PPJ10.Poprawa.Task04;

public class Main {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Jan");
        Spawacz spawacz = new Spawacz("Marcin", 5);

        System.out.println(osoba.wyswietl());
        System.out.println(spawacz.wyswietl());
    }
}