package PPJ04;

public class Task01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Jan";
        p.surname = "Krakowski";
        p.birthYear = 1990;
    }
}
class Person {
    String name;
    String surname;
    int birthYear;
}
