package PPJ07;

public class Task01 {
    public static void main(String[] args) {
        int wrt = -3;

        boolean zbiorA = (-15 < wrt && wrt <= -10) || (-5 < wrt && wrt <= 0) || (5 < wrt && wrt <= 10);
        boolean zbiorB = (-Double.MAX_VALUE < wrt && wrt <= -13) || (-8 < wrt && wrt <= -3);
        boolean zbiorC = (-4 <= wrt && wrt <= Double.MAX_VALUE);

        if (zbiorA && zbiorB && zbiorC) {
            System.out.println("Nalezy do wszystkich zbiorow!");
        } else {
            System.out.println("Nie nalezy do wszystkich zbiorow!");
        }

    }
}
