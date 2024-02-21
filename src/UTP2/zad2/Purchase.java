/**
 * @author Politowicz Jakub S26211
 */

package UTP2.zad2;

import java.beans.*;

public class Purchase {
    private String prod;
    private String data;
    private Double price;

    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private final VetoableChangeSupport vetoableChangeSupport = new VetoableChangeSupport(this);

    public Purchase(String prod, String data, Double price) {
        this.prod = prod;
        this.data = data;
        this.price = price;
    }
    public void setProd(String prod) {
        String oldValue = this.prod;
        this.prod = prod;
        propertyChangeSupport.firePropertyChange("prod", oldValue, prod);
    }

    public void setData(String data) {
        String oldValue = this.data;
        this.data = data;
        System.out.println("Change value of: data from: " + oldValue + " to: " + data);
    }

    public void setPrice(Double price) throws PropertyVetoException {
        Double oldValue = this.price;
        PropertyChangeEvent event = new PropertyChangeEvent(this, "price", oldValue, price);

        vetoableChangeSupport.fireVetoableChange(event);

        if (price < 1000) {
            throw new PropertyVetoException("Price change to: " + price + " not allowed", event);
        } else {
            this.price = price;
            System.out.println("Change value of: price from: " + oldValue + " to: " + price);
        }
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        vetoableChangeSupport.addVetoableChangeListener(listener);
    }

    public void removeVetoableChangeListener(VetoableChangeListener listener) {
        vetoableChangeSupport.removeVetoableChangeListener(listener);
    }

    @Override
    public String toString() {
        return "Purchase [prod=" + prod + ", data=" + data + ", price=" + price + "]";
    }
}