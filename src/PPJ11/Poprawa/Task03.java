package PPJ11.Poprawa;

public class Task03 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(), new Dog(), new Cow()
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

class Animal {
    protected String species;

    public Animal(String species) {
        this.species = species;
    }

    public void makeSound() {
        System.out.println("Unknown");
    }
}

class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cow extends Animal {
    public Cow() {
        super("Cow");
    }

    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}