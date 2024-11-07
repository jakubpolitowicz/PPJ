package PPJ11;

public class Task01 {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1}
        };

        int elementy = 0;

        for (int[] ints : tab) {
            elementy += ints.length;
        }
        int[] tablica = new int[elementy];
        int indeks = 0;
        for (int[] ints : tab) {
            for (int anInt : ints) {
                tablica[indeks++] = anInt;
            }
        }
        for (int a : tablica){
            System.out.print(a + ", ");
        }
    }
}