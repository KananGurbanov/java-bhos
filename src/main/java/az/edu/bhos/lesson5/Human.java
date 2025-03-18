package az.edu.bhos.lesson5;

import java.util.Objects;

public abstract class Human {
    static int numOfPeople;
    private String name;
    int age;
    private Pet pet;

    public Pet getPet() {
        return pet;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        numOfPeople++;
    }

    public Human(String name, int age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public Human() {
        numOfPeople++;
    }

    public Human(String name) {
        this.name = name;
        numOfPeople++;
    }

    static int printNumOfPeople(){
        return numOfPeople;
    }

    public String getName() {
        return name + ".";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void greetTo(String name);

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(pet, human.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, pet);
    }
}
