package az.edu.bhos.lesson5;

import java.util.Objects;

public class Animal {
    private String nickName;
    private int age;
    private String color;

    public Animal(String nickName, int age, String color) {
        this.nickName = nickName;
        this.age = age;
        this.color = color;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(nickName, animal.nickName) && Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName, age, color);
    }

    @Override
    public String toString() {
        return "{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    int a = 5;

    Integer a2 = a;

    int b = a2;


}
