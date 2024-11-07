package PPJ13;

public class Task01 {
        public static void main(String[] args) {
            String input = "A.B.C.D.";

            String regex = "[A-Za-z]\\.[A-Za-z]\\.[A-Za-z]\\.[A-Za-z]\\.";

            if (input.matches(regex)) {
                System.out.println("Ciag pasuje");
            } else {
                System.out.println("Ciag nie pasuje");
            }
        }
}
