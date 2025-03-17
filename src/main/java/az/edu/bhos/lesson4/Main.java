package az.edu.bhos.lesson4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(CarType.BMW, "black", 50000.0);
        System.out.println(Car.numOfCars);
        Car car2 = new Car(CarType.BMW, "black", 50000.0);
        System.out.println(Car.numOfCars);
        Car car3 = new Car(CarType.BMW, "black", 50000.0);
        System.out.println(Car.numOfCars);
        Car car4 = new Car(CarType.BMW, "black", 50000.0);
        System.out.println(Car.numOfCars);
        Car car5 = new Car(CarType.BMW, "black", 50000.0);
        System.out.println(Car.numOfCars);
        System.out.println(car1);
        car1.beep();
        System.out.println(car1.info());

        String s = car1.setColor("purple");
        System.out.println(s);

        System.out.println(Car.numOfCars);
    }
}
