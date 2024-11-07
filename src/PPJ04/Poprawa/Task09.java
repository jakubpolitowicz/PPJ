package PPJ04.Poprawa;

public class Task09 {
    public static void main(String[] args) {
        int wrt = -14;

        if (wrt > -15 && wrt < -10){
            System.out.println("Nalezy do zbioru A");
        } else if (wrt < -13) {
            System.out.println("Nalezy do zbioru B");
        }
        else {
            System.out.println("Nie nalezy do zadnego z podanych zbiorow");
        }
    }
}