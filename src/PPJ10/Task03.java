package PPJ10;

public class Task03 {
    public static void main(String[] args) {
        int[] tablica = {1,1,1,1,1,1,2,2,2,2,2,23,3,3,4,4,2,5,8,56,76,67};

        for (int j : tablica) {
            System.out.print(j + ", ");
        }
        System.out.println();

        int iloscRoznychWartosci = 1;
        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] != tablica[i - 1]) {
                iloscRoznychWartosci++;
            }
        }

        System.out.println(iloscRoznychWartosci);
    }
}
