package az.edu.bhos.lesson4;

public class Car {
    public static int numOfCars;
    CarType model;
    String color;
    double price;

    public Car(CarType model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
        numOfCars++;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void beep() {
        System.out.println("BEEPPPP!!!!!");
    }

    public String info() {
        return "model=" + model + ", color=" + color + ", price=" + price;
    }

    public String setColor(String color) {
        this.color = color;
        return color;
    }
}