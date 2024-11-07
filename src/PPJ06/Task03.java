package PPJ06;

public class Task03 {
    public static void main(String[] args) {
        Truck truck = new Truck("Bialy", 4, 110);
        System.out.println("Kolor: " + truck.getColor());
        System.out.println("Liczba osi: " + truck.getNumberOfAxels());
        System.out.println("Masa: " + truck.getMass());

        truck.startEngine();
    }
}
class Vehicle {
    private String color;

    public Vehicle(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}

class WheeledVechicle extends Vehicle{
    private int numberOfAxels;

    public WheeledVechicle(String color, int numberOfAxels){
        super(color);
        this.numberOfAxels = numberOfAxels;
    }

    public int getNumberOfAxels() {
        return numberOfAxels;
    }
}

class Truck extends WheeledVechicle{
    private double mass;

    public Truck(String color, int numberOfAxles, double mass) {
        super(color, numberOfAxles);
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }

    public void startEngine(){
        double pressurePerAxle = getMass()/getNumberOfAxels();

        if (pressurePerAxle > 11){
             System.out.println("Jazda niebezpieczna, odmowa uruchomienia silnika");
        }else{
            System.out.println("Silnik dziala prawidlowo");
        }
    }
}

