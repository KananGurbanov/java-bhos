package az.edu.bhos.lesson5;

public class Woman extends Human {
    public Woman(String name, int age, Pet pet) {
        super(name, age, pet);
    }

    public void giveBirth() {
        System.out.println("New baby!");
    }

    @Override
    public void greetTo(String name) {
        System.out.println("Hi i am woman");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
