package PPJ08.Poprawa;

public class Task02 {
    public static void main(String[] args) {
        int wrt = 5;

        modifyValue(wrt);
    }

    private static void modifyValue(int value){
        //1 kropka
        System.out.println(value);
        //2 kropka
        value = value * 5;
        //3 kropka
        System.out.println(value);
    }
}