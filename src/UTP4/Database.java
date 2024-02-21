/**
 * @author Politowicz Jakub S26211
 **/

package UTP4;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.List;

public class Database {

    private String url;
    private TravelData travelData;

    public Database(String url, TravelData travelData) {
        this.url = url;
        this.travelData = travelData;
    }

    public void create() {
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            String createTableQuery = "CREATE TABLE IF NOT EXISTS TravelOffers ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "country TEXT NOT NULL,"
                    + "start_date DATE NOT NULL,"
                    + "end_date DATE NOT NULL,"
                    + "place TEXT NOT NULL,"
                    + "price REAL NOT NULL,"
                    + "currency TEXT NOT NULL)";

            stmt.executeUpdate(createTableQuery);

            List<String> offersList = travelData.getOffersDescriptionsList("pl_PL", "yyyy-MM-dd");

            for (String offer : offersList) {
                String[] offerTokens = offer.split("\\s");
                String country = offerTokens[0];
                String startDate = offerTokens[1];
                String endDate = offerTokens[2];
                String place = offerTokens[3];
                double price = Double.parseDouble(offerTokens[4].replace(",", ""));
                String currency = offerTokens[5];

                String insertQuery = "INSERT INTO TravelOffers (country, start_date, end_date, place, price, currency) "
                        + "VALUES (?, ?, ?, ?, ?, ?)";

                try (PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
                    pstmt.setString(1, country);
                    pstmt.setString(2, startDate);
                    pstmt.setString(3, endDate);
                    pstmt.setString(4, place);
                    pstmt.setDouble(5, price);
                    pstmt.setString(6, currency);

                    pstmt.executeUpdate();
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void showGui() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Travel Offers");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            DefaultTableModel model = new DefaultTableModel();
            JTable table = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(table);

            JPanel panel = new JPanel();
            JComboBox<String> languageComboBox = new JComboBox<>(new String[]{"pl_PL", "en_GB"});
            JButton refreshButton = getjButton(languageComboBox, model);

            panel.add(new JLabel("Select Language:"));
            panel.add(languageComboBox);
            panel.add(refreshButton);

            frame.add(panel, "North");
            frame.add(scrollPane);

            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    private JButton getjButton(JComboBox<String> languageComboBox, DefaultTableModel model) {
        JButton refreshButton = new JButton("Refresh");

        refreshButton.addActionListener(e -> {
            String selectedLocale = (String) languageComboBox.getSelectedItem();
            List<String> offers = travelData.getOffersDescriptionsList(selectedLocale, "yyyy-MM-dd");

            model.setColumnCount(0);
            model.setRowCount(0);

            String[] columns = {"Country", "Departure Date", "Return Date", "Place", "Price", "Currency"};
            for (String column : columns) {
                model.addColumn(column);
            }

            for (String offer : offers) {
                String[] parts = offer.split(" ");
                model.addRow(parts);
            }
        });
        return refreshButton;
    }
}