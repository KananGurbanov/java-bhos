package az.edu.bhos.lesson5;

public class Pet {
    private String nickName;
    private int age;
    private String color;
    private PetType petType;

    public Pet(String nickName, PetType petType) {
        this.nickName = nickName;
        this.petType = petType;
    }

    public void sayMyName() {
        System.out.println("My name is " + nickName);
    }
}
