package PPJ11.Poprawa;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        Drzewo drzewo = new Drzewo();
        Owoc[] owoce = new Owoc[100];

        double totalMasa = 0;
        int index = 0;
        int jablkaCount = 0;
        int pomaranczeCount = 0;
        int gruszkiCount = 0;

        while (totalMasa < 5000) {
            Owoc owoc = drzewo.zerwijOwoc();
            owoce[index] = owoc;
            totalMasa += owoc.getMasa();

            switch (owoc.getNazwa()) {
                case "Jablko":
                    jablkaCount++;
                    break;
                case "Pomarancza":
                    pomaranczeCount++;
                    break;
                case "Gruszka":
                    gruszkiCount++;
                    break;
            }

            index++;
        }

        System.out.println("Zebrano owoce o masie 5kg:");
        System.out.println("Jablka: " + jablkaCount);
        System.out.println();
        System.out.println("Pomarancze: " + pomaranczeCount);
        System.out.println("Gruszki: " + gruszkiCount);
    }
}

class Owoc {
    private String nazwa;
    private double masa;

    public Owoc(String nazwa) {
        this.nazwa = nazwa;
        this.masa = losujMase();
    }

    private double losujMase() {
        Random rand = new Random();
        return 100 + rand.nextDouble() * 150;
    }

    public double getMasa() {
        return masa;
    }

    public String getNazwa() {
        return nazwa;
    }
}

class Jablko extends Owoc {
    public Jablko() {
        super("Jablko");
    }
}

class Pomarancza extends Owoc {
    public Pomarancza() {
        super("Pomarancza");
    }
}

class Gruszka extends Owoc {
    public Gruszka() {
        super("Gruszka");
    }
}

class Drzewo {
    private static final Random random = new Random();

    public Owoc zerwijOwoc() {
        int choice = random.nextInt(3);
        return switch (choice) {
            case 0 -> new Jablko();
            case 1 -> new Pomarancza();
            case 2 -> new Gruszka();
            default -> null;
        };
    }
}