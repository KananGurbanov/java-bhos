package az.edu.bhos.lesson3;

class PersonNew {
    String name;
}

public class PassByValueReference {
    public static void main(String[] args) {
        PersonNew p = new PersonNew();
        p.name = "Alice";

        changeReference(p);
        System.out.println("After method call: " + p.name); // Still Alice
    }

    static void changeReference(PersonNew obj) {
        obj = new PersonNew(); // Creates a new object (only affects local 'obj')
        obj.name = "Charlie";
    }
}
