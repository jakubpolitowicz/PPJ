package PPJ12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MojSkaner {
    private final BufferedReader reader;
    public MojSkaner(InputStream inputStream) {
        this.reader = new BufferedReader(new InputStreamReader(inputStream));
    }
    public String odczytajSlowo() throws IOException {
        StringBuilder slowo = new StringBuilder();
        int znak;
        while ((znak = reader.read()) != -1 && Character.isWhitespace(znak)) {
        }

        while (znak != -1 && !Character.isWhitespace(znak)) {
            slowo.append((char) znak);
            znak = reader.read();
        }
        return slowo.toString();
    }
    public String odczytajLinie() throws IOException {
        return reader.readLine();
    }
    public int odczytajLiczbeCalkowita() throws IOException {
        String strLiczba = odczytajSlowo();
        try {
            return Integer.parseInt(strLiczba);
        } catch (NumberFormatException e) {
            throw new IOException("Brak mozliwosci odczytu liczby calkowitej: " + strLiczba);
        }
    }
    public int odczytajDodatniaLiczbeCalkowita() throws Exception {
        int liczba = odczytajLiczbeCalkowita();
        if (liczba <= 0) {
            throw new Exception("Liczba nie jest dodatnia");
        }
        return liczba;
    }

    public static void main(String[] args) {
        try {
            InputStream inputStream = System.in;
            MojSkaner skaner = new MojSkaner(inputStream);

            System.out.print("Podaj slowo: ");
            String slowo = skaner.odczytajSlowo();
            System.out.println("Odczytane slowo: " + slowo);

            System.out.print("Podaj linie tekstu: ");
            String linia = skaner.odczytajLinie();
            System.out.println("Odczytana linia: " + linia);

            System.out.print("Podaj liczbe calkowita: ");
            int liczba = skaner.odczytajLiczbeCalkowita();
            System.out.println("Odczytana liczba calkowita: " + liczba);

            System.out.print("Podaj dodatnia liczbe calkowita: ");
            int dodatniaLiczba = skaner.odczytajDodatniaLiczbeCalkowita();
            System.out.println("Odczytana dodatnia liczba calkowita: " + dodatniaLiczba);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}