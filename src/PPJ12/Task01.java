package PPJ12;

import java.io.FileInputStream;
import java.io.IOException;

public class Task01 {
    public static void main(String[] args) {
        String filePath = "C:/Users/jakub/Desktop/zad1.txt";
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            int data;
            int[] liczbaZnakow = new int[256];
            while ((data = fileInputStream.read()) != -1) {
                char znak = (char) data;
                liczbaZnakow[znak]++;
            }
            System.out.println("Znaki  i ich liczba wystapien w pliku: ");
            for (int i = 0; i < liczbaZnakow.length; i++) {
                if (liczbaZnakow[i] > 0) {
                    System.out.println((char) i + ": " + liczbaZnakow[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}