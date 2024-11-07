package PPJ08;

import java.time.LocalDate;

public class Task02 {
    public static void main(String[] args) {
        int day = 27;
        int month = 11;
        int year = 2023;

        LocalDate aktualnaData = LocalDate.of(year, month, day);
        LocalDate liczbaDni = LocalDate.of(year, 1, 1);

        int ileDniUplunelo = 0;

        while (liczbaDni.isBefore(aktualnaData) || liczbaDni.isEqual(aktualnaData)) {
            ileDniUplunelo++;
            liczbaDni = liczbaDni.plusDays(1);
        }

        System.out.println("Tyle dni mineło: " + ileDniUplunelo);

    }
}
