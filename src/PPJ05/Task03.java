package PPJ05;

public class Task03 {
    public static void main(String[] args) {
        Person p1 = new Person("Marian", 1991);
        Person p2 = new Person("Waclaw");

        System.out.println("Imię: " + p1.getName());
        System.out.println("Wiek: " + p1.getAge());

        System.out.println("Imię: " + p2.getName());
        System.out.println("Wiek: " + p2.getAge());

        if (p1.equals(p2)) {
            System.out.println('\n' + "Osoby sa identyczne!");
        } else {
            System.out.println('\n' + "Osoby nie sa identyczne!");
        }
    }
}

class Person {
    String name;
    int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(String name) {
        this.name = name;
        birthYear = 1990;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return birthYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return birthYear == person.birthYear && name.equals(person.name);
    }
}
