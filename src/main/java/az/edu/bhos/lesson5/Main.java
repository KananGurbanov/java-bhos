package az.edu.bhos.lesson5;

import java.util.HashMap;

public class Main {


    public static void main(String[] args) {
        Pet toplan = new Pet("Toplan", PetType.DOG);
//        Woman woman = new Woman("Mehriban", 25, toplan); //123
        Woman woman2 = new Woman("sadgfggsd", 25, toplan); //123

        HashMap hashMap = new HashMap();
        hashMap.put("Topla", toplan);

        int numOfPeople = Human.numOfPeople;

        //1. get hashcode
        //2. get index from that hashcode
        //3. put object
        // if 2 objects are returned with true using equals, then their hashcodes are same
        // if their hashcodes are same, that does not necessarily mean that they are same

        Animal garabash = new Animal("smth", 2, "qara");

        int age = garabash.getAge();



        System.out.println(garabash);

        Box<Man, Human> box = new Box<>(new Man());



        Human man = new Man();

        Man man2 = new Man();

        Human woman = new Woman();

        Runnable man3 = () -> {
            System.out.println("Hello man3");
        };

        man3.run();

    }

    static void get(Human h){
        h.speak();
    }


}
