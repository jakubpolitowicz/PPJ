package PPJ04;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        Fruit f = new Fruit("jablko");
        System.out.println("Fruit name: " + f.name);
        System.out.println("Fruit weight: " +f.weight);
    }
}
class Fruit{
    String name;
    double weight;
    Random r = new Random();

    public Fruit(String name){
        this.name = name;
        this.weight = r.nextDouble(0.5,0.8);
    }
}
