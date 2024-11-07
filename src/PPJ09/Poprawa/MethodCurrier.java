package PPJ09.Poprawa;

public class MethodCurrier {
    public void setValue(int a) {
        System.out.println("Value of int: " + a);
        a += 10;
        System.out.println("Value of int after: " + a);
    }

    public void setValue(float a) {
        System.out.println("Value of float: " + a);
        a += 10f;
        System.out.println("Value of float after: " + a);
    }

    public void setValue(Number number) {
        System.out.println("Value of number before: " + number.getValue());
        number.setValue(number.getValue() + 10);
        System.out.println("Value of number after: " + number.getValue());
    }

    public static void main(String[] args) {
        MethodCurrier m = new MethodCurrier();

        m.setValue(10);
        m.setValue(10.5f);

        Number number = new Number();
        number.setValue(20);
        m.setValue(number);
    }
}