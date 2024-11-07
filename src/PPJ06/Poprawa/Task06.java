package PPJ06.Poprawa;

public class Task06 {
    public static void main(String[] args) {
        int tab[] = { 789, 678, 567};

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.println(tab[i] - tab[j]);
            }
        }
    }
}