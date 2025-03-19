package az.edu.bhos.lesson5;

public class Box <T, A>{
    T data;

    public Box(T data) {
        this.data = data;
    }

    public A get (T data) {
        return (A) data;
    }
}
