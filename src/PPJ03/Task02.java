package PPJ03;

public class Task02 {
    public static void main(String[] args) {
        boolean logiczna1 = true;
        boolean logiczna2 = false;

        int liczbaCal1 = 10;
        int liczbaCal2 = 20;

        double liczbaRzecz1 = 3.14;
        double liczbaRzecz2 = 2.71;

        char znak1 = 'A';
        char znak2 = 'B';

        System.out.println("Porownanie zmiennych logicznych:");
        System.out.println("logiczna1 == logiczna2: " + (logiczna1 == logiczna2));
        System.out.println("logiczna1 == true: " + (logiczna1 == true));
        System.out.println("logiczna2 == false: " + (logiczna2 == false));

        System.out.println("\nPorownanie zmiennych calkowitych:");
        System.out.println("liczbaCal1 == liczbaCal2: " + (liczbaCal1 == liczbaCal2));
        System.out.println("liczbaCal1 == 10: " + (liczbaCal1 == 10));
        System.out.println("liczbaCal2 == 20: " + (liczbaCal2 == 20));

        System.out.println("\nPorownanie zmiennych rzeczywistych:");
        System.out.println("liczbaRzecz1 == liczbaRzecz2: " + (liczbaRzecz1 == liczbaRzecz2));
        System.out.println("liczbaRzecz1 == 3.14: " + (liczbaRzecz1 == 3.14));
        System.out.println("liczbaRzecz2 == 2.71: " + (liczbaRzecz2 == 2.71));

        // Nie można porównać char z innymi typami wprost za pomocą ==
        // System.out.println("\nPorownanie zmiennych kodujacych znaki:");
        // System.out.println("znak1 == znak2: " + (znak1 == znak2));
        // System.out.println("znak1 == 'A': " + (znak1 == 'A'));
        // System.out.println("znak2 == 'B': " + (znak2 == 'B'));
    }
}