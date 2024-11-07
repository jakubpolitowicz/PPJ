package PPJ13.Poprawa;

import java.io.*;

public class Task01 {
    public static void main(String[] args) {
        String inputFilePath = "test.txt";
        String outputFilePath = "test.dat";

        try {
            StringBuilder bitString = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
                int character;
                while ((character = reader.read()) != -1) {
                    bitString.append((char) character);
                }
            }

            int length = bitString.length();
            byte[] byteArray = new byte[(length + 7) / 8];
            for (int i = 0; i < length; i++) {
                if (bitString.charAt(i) == '1') {
                    byteArray[i / 8] |= 1 << (7 - (i % 8));
                }
            }

            try (FileOutputStream outputStream = new FileOutputStream(outputFilePath)) {
                outputStream.write(byteArray);
            }

            File inputFile = new File(inputFilePath);
            File outputFile = new File(outputFilePath);
            System.out.println("Input file size: " + inputFile.length() + " bytes");
            System.out.println("Output file size: " + outputFile.length() + " bytes");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}