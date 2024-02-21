/**
 *
 *  @author Politowicz Jakub S26211
 *
 */


package UTP2.zad2;


import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

public class Main {
  public static void main(String[] args) {
    Purchase purch = new Purchase("komputer", "nie ma promocji", 3000.00);
    System.out.println(purch);

    // Dodanie listenera dla zmian w property "data"
    purch.addPropertyChangeListener(evt -> System.out.println("Change value of: " + evt.getPropertyName() +
            " from: " + evt.getOldValue() +
            " to: " + evt.getNewValue()));

    // Dodanie listenera dla wetowania zmian w property "price"
    VetoableChangeListener vetoListener = evt -> {
      if (evt.getPropertyName().equals("price") && (Double) evt.getNewValue() < 1000) {
        throw new PropertyVetoException("Price change to: " + evt.getNewValue() + " not allowed", evt);
      }
    };

    purch.addVetoableChangeListener(vetoListener);

    try {
      purch.setData("w promocji");
      purch.setPrice(2000.00);
      System.out.println(purch);

      // Usunięcie listenera
      purch.removeVetoableChangeListener(vetoListener);

      purch.setPrice(500.00);

    } catch (PropertyVetoException exc) {
      System.out.println(exc.getMessage());
    }
    System.out.println(purch);
  }
}