package PPJ12.Poprawa;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        try {
            Rakieta rakieta = new Rakieta("Apollo", 500);
            rakieta.zatankuj();
            rakieta.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Rakieta {
    private final String nazwa;
    private int wagaPaliwa;

    public Rakieta(String nazwa, int wagaPaliwa) {
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }

    public void zatankuj() {
        Random rand = new Random();
        this.wagaPaliwa += rand.nextInt(1001);
    }

    public void start() throws Exception {
        if (this.wagaPaliwa < 1000) {
            throw new Exception("start niemozliwy - za malo paliwa");
        }
        System.out.println("Rakieta " + this.nazwa + " wystartowala!");
    }
}