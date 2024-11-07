package PPJ06;

public class Task02 {
    public static void main(String[] args) {
        Person person = new Person("Maciek");
        System.out.println(person.show());

        Welder welder = new Welder("Jan", 2);
        System.out.println(welder.show());
    }
}

class Welder extends Person {
    private int lengthOfService;

    public Welder(String name, int lengthOfService) {
        super(name);
        this.lengthOfService = lengthOfService;
    }

    public int getLengthOfService() {
        return lengthOfService;
    }

    @Override
    public String show() {
        return "Spawacz = " + getName() + ", dlugosc uslugi = " + getLengthOfService();
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String show() {
        return "Osoba: " + getName();
    }
}