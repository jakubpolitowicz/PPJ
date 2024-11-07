package PPJ10.Poprawa.Task03;

public class Main {
    public static void main(String[] args) {
        System.out.println("PROSTOKAT");
        Prostokat prostokat = new Prostokat(4, 5);
        prostokat.show();
        System.out.println();


        System.out.println("PROSTOPADLOSCIAN");
        Prostopadloscian prostopadloscian = new Prostopadloscian(3, 4, 5);
        prostopadloscian.show();
        System.out.println();

        System.out.println("TROJKAT");
        Trojkat trojkat = new Trojkat(4);
        trojkat.show();
        System.out.println();

        System.out.println("OSTROSLUP");
        Ostroslup ostroslup = new Ostroslup(2,3,4);
        ostroslup.show();
        System.out.println();

        System.out.println("GRANIASTOSLUP");
        Graniastoslup graniastoslup = new Graniastoslup(7,8);
        graniastoslup.show();
    }
}