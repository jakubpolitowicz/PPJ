/**
 * @author Politowicz Jakub S26211
 **/

package UTP4;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TravelData {

    private File dataDir;

    public TravelData(File dataDir) {
        this.dataDir = dataDir;
    }

    public List<String> getOffersDescriptionsList(String loc, String dateFormat) {
        List<String> offersList = new ArrayList<>();

        if (dataDir != null && dataDir.isDirectory()) {
        for (File file : Objects.requireNonNull(dataDir.listFiles())) {
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String[] tokens = scanner.nextLine().split("\t");
                    Locale locale = Locale.forLanguageTag(tokens[0]);
                    String country = tokens[1];
                    String startDate = tokens[2];
                    String endDate = tokens[3];
                    String place = tokens[4];
                    String price = tokens[5];
                    String currency = tokens[6];

                    ResourceBundle bundle = ResourceBundle.getBundle("TravelDataBundle", locale);
                    String formattedDate = formatDate(startDate, endDate, dateFormat, locale);
                    String formattedPrice = formatPrice(price, currency, locale);

                    String offerDescription = bundle.getString(country) + " " + formattedDate + " " + place + " " + formattedPrice;
                    offersList.add(offerDescription);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    } else {
        System.out.println("Invalid data directory: " + dataDir);
    }

        return offersList;
    }

    private String formatDate(String startDate, String endDate, String dateFormat, Locale locale) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat, locale);
        try {
            Date start = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
            Date end = new SimpleDateFormat("yyyy-MM-dd").parse(endDate);
            return sdf.format(start) + " " + sdf.format(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    private String formatPrice(String price, String currency, Locale locale) {
        NumberFormat nf = NumberFormat.getNumberInstance(locale);
        double amount = Double.parseDouble(price.replace(",", ""));
        return nf.format(amount) + " " + currency;
    }

}