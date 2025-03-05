package az.edu.bhos.lesson2;

class Person {
    String name;
}

public class PassByValueObject {
    public static void main(String[] args) {
        PersonNew p = new PersonNew();
        p.name = "Alice";

        modifyObject(p);
        System.out.println("After method call: " + p.name); // Bob
    }

    static void modifyObject(PersonNew obj) {
        obj.name = "Bob"; // Modifies the object itself
    }
}