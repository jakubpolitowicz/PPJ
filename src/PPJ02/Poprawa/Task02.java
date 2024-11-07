package PPJ02.Poprawa;

public class Task02 {
    public static void main(String[] args) {

        //14 = 1110

        int a = 0b1110 >> 0; //00001110
        System.out.println("Rezultat poprzedniego punktu o 0 pozycji w prawo: " + a);

        int b = a << 2; //00111000
        System.out.println("Rezultat poprzedniego punktu o 2 pozycje w lewo: " + b);

        int c = b >> 4; //00000011
        System.out.println("Rezultat poprzedniego punktu o 4 pozycje w prawo: " + c);
    }
}