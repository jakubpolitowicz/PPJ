package PPJ02;

public class Task03 {
    public static void main(String[] args) {

        int a = 0b1010010011;
        int b = 0x98765432;

        int ostatniePiecBitow = a & 0b11111;
        System.out.println("Wartosc reprezentowana przez ostatnie (najmlodsze) 5 bitow tego literalu: " + ostatniePiecBitow);
        System.out.println();

        int siedemBitow = (a >> 6) & 0b1;
        System.out.println("1 lub 0 zaleznie od wartosci siodmego bitu tego literalu: " + siedemBitow);
        System.out.println();

        int bajt = (b >> 24) & 0xFF;
        int bajt2 = (b >> 16) & 0xFF;
        int bajt3 = (b >> 8) & 0xFF;
        int bajt4 = b & 0xFF;
        System.out.println("Wartosc poszczegolnych bajtow (poczawszy od najbardziej znaczacego) z ktorych sklada się ta liczba - wynikiem powinny byc 4 liczby z przedzialu [0 - 255]: " + bajt + " " + bajt2 + " " + bajt3 + " " + bajt4);
        System.out.println();

        int srodkoweBajty = (b >> 8) & 0xFFFF;
        System.out.println("Wartosc reprezentowana przez dwa srodkowe bajty literalu reprezentowane jako liczba z przedzialu [0, 2^{16}-1 = 65535]: " + srodkoweBajty);
    }
}