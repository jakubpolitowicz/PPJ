package PPJ05.Poprawa;

import java.util.Scanner;

public class Task08 {
    
    private static char[] kierunek = {'↑', '→', '↓', '←'};
    private static int obecnyKierunek = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c;

        while (true) {
            System.out.println("Obecny kierunek: " + kierunek[obecnyKierunek]);

            System.out.print("Nacisnij 'a' aby przekrecic sie w lewo lub 'd' by przekrecic sie w prawo: ");
            c = in.next().charAt(0);

            if (c == 'a') {
                obecnyKierunek = (obecnyKierunek - 1 + 4) % 4;
                System.out.println("Przekreciles sie na zachod. Nowy kierunek: " + kierunek[obecnyKierunek]);
            } else if (c == 'd') {
                obecnyKierunek = (obecnyKierunek + 1) % 4;
                System.out.println("Przekreciles sie na wschod. Nowy kierunek: " + kierunek[obecnyKierunek]);
            } else {
                System.out.println("Nieznana wartosc. Uzyj 'a' lub 'd'!");
            }
        }
    }
}