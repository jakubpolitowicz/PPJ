package PPJ08.Poprawa;

public class Task05 {
    public static void main(String[] args) {
        kwadrat(6, 'x');
    }

    public static void kwadrat(int rozmiar, char startChar) {
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(startChar);
                } else {
                    System.out.print((startChar == 'x') ? 'o' : 'x');
                }
            }
            System.out.println();
        }
    }
}