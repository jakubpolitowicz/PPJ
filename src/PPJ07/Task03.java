package PPJ07;

public class Task03 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Wprowadz pojedynczy znak: ");
        char ch = scanner.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'Y') {
            System.out.println(ch + " to samogloska.");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " to spolgloska.");
        } else {
            System.out.println(ch + " to nie jest litera.");
        }
    }
}
