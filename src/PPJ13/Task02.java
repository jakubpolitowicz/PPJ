package PPJ13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02 {
    public static void main(String[] args) {
        String[] przyklady = {"-29.30", "-12", "-0.343536", "0.2", ".2", "11", "13.14", "-.5"};

        String regex = "^-?\\d*\\.?\\d+$";
        Pattern pattern = Pattern.compile(regex);

        for (String s : przyklady) {
            Matcher matcher = pattern.matcher(s);
            System.out.println(s + ": " + matcher.matches());
        }
    }
}