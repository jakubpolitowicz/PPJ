package PPJ02.Poprawa;

public class Task03 {
    public static void main(String[] args) {
        int literal = 65535;

        int ostatnie5Bitow = literal & 0b11111;

        int siodmyBit = (literal >> 6) & 1;

        int bajt1 = (literal >> 24) & 0xFF;
        int bajt2 = (literal >> 16) & 0xFF;
        int bajt3 = (literal >> 8) & 0xFF;
        int bajt4 = literal & 0xFF;

        int srodkoweBajty = (bajt2 << 8) | bajt3;

        System.out.println("Ostatnie 5 bitow: " + ostatnie5Bitow);
        System.out.println("Siodmy bit: " + siodmyBit);
        System.out.println("Bajty: " + bajt1 + ", " + bajt2 + ", " + bajt3 + ", " + bajt4);
        System.out.println("Dwa srodkowe bajty: " + srodkoweBajty);
    }
}
