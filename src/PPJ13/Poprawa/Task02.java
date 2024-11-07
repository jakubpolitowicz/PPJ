package PPJ13.Poprawa;

import java.io.FileInputStream;
import java.io.IOException;

public class Task02 {
    public static void main(String[] args) {
        String filePath = "test.txt";

        int[] charCountArray = new int[128];

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            int byteRead;
            while ((byteRead = fileInputStream.read()) != -1) {
                if (byteRead < 128) {
                    charCountArray[byteRead]++;
                }
            }

            for (int i = 0; i < charCountArray.length; i++) {
                if (charCountArray[i] > 0) {
                    System.out.println("'" + (char) i + "' : " + charCountArray[i]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}