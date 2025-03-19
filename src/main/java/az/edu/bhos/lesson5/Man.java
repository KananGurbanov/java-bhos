package az.edu.bhos.lesson5;

public class Man extends Human implements Runnable{

    public Man(String name) {
        super(name);
    }

    @Override
    public void greetTo(String name) {

    }

    public Man() {
    }

    public Man(String name, int age, Pet pet) {
        super(name, age, pet);
    }

    public Man(String name, int age) {
        super(name, age);
    }


    @Override
    public void speak() {
        System.out.println("Man is speaking!");
    }

    public void shout(){
        System.out.println("Man is shouting!");
    }


    @Override
    public void run() {

    }
}
