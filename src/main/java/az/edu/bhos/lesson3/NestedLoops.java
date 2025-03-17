package az.edu.bhos.lesson3;

import az.edu.bhos.lesson4.Car;
import az.edu.bhos.lesson4.CarType;

public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        Car car = new Car(CarType.BMW, "red", 50.0);

        System.out.println(car);
    }
}
