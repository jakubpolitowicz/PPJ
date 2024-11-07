package PPJ08;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj liczbe naturalna dodatnia: ");
        long liczba = scanner.nextLong();

        if (liczba < 0){
            System.out.println("Liczba musi być dodatania");
        }else {


            long najwiekszyDzielnik = najwiekszyDzielnik(liczba);
            System.out.println("Najwiekszy dzielnik to:" + najwiekszyDzielnik);
        }
    }

   private static long najwiekszyDzielnik(long liczba) {
       if (liczba < 2) {
           System.out.println("Mniejsza od 0");
       }

       long i = liczba / 2;
       while (i > 1) {
           if (liczba % i == 0 && jestLiczbaPierwsza(i)) {
               return i;
           }
           i--;
       }
       return liczba;
   }

    private static boolean jestLiczbaPierwsza(long liczba) {
        if (liczba < 2) {
            return false;
        }
        long i = 2;
        while (i <= Math.sqrt(liczba)) {
            if (liczba % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
