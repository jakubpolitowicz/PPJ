package PPJ02.Poprawa;

public class Task01 {
    public static void main(String[] args) {
        int number = 165;

        String binarna = Integer.toBinaryString(number);

        String oktalna = Integer.toOctalString(number);

        String heksadecymalna = Integer.toHexString(number);

        System.out.println("Liczba w systemie binarnym: " + binarna);
        System.out.println("Liczba w systemie oktalnym: " + oktalna);
        System.out.println("Liczba w systemie heksadecymalnym: " + heksadecymalna);
    }
}
