package PPJ08.Poprawa;

public class Task03 {
    public static void main(String[] args) {

        char[] tab = {'a','l','a',' ','m','a',' ','k','o','t','a'};

        countCharacter(tab, 'l');

    }

    private static void countCharacter(char[] tab, char character) {
        int count = 0;
        for (char c : tab) {
            if (c == character) {
                count++;
            }
        }
        System.out.println(count);
    }
}