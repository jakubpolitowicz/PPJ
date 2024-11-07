package PPJ13;

import java.io.*;

public class Task03 {
    public static void main(String[] args) {
        String wejscie = "wejscie.txt";
        String wyjscie = "wyjscie.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(wejscie));
             BufferedWriter writer = new BufferedWriter(new FileWriter(wyjscie))) {

            String linia;

            String regex = "Math\\.max\\((\\w+|\\d+\\.\\d+), (\\w+|\\d+\\.\\d+)\\)";

            while ((linia = reader.readLine()) != null) {
                int index = linia.indexOf("Math.max");
                while (index != -1) {
                    int ostatniIndeks = pasujacyIndeks(linia, index + "Math.max".length());
                    if (ostatniIndeks != -1) {
                        String wywolanie = linia.substring(index, ostatniIndeks + 1);
                        String argumenty = inneArgumenty(wywolanie, regex);
                        if (!argumenty.isEmpty()) {
                            writer.write(argumenty + "\n");
                        }
                        index = linia.indexOf("Math.max", ostatniIndeks + 1);
                    } else {
                        break;
                    }
                }
            }

            System.out.println("Udalo sie! Wyniki znajduje sie w pliku: " + wyjscie);

        } catch (IOException e) {
            System.err.println("Blad operacji: " + e.getMessage());
        }
    }

    private static String inneArgumenty(String wywolanie, String regex) {
        String argumenty = "";
        if (wywolanie.matches(regex)) {
            argumenty = wywolanie.replaceAll(regex, "($1, $2)");
        }
        return argumenty;
    }

    private static int pasujacyIndeks(String linia, int pierwszyIndeks) {
        int liczba = 1;
        for (int i = pierwszyIndeks; i < linia.length(); i++) {
            char liczbaCharow = linia.charAt(i);
            if (liczbaCharow == '(') {
                liczba++;
            } else if (liczbaCharow == ')') {
                liczba--;
                if (liczba == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}