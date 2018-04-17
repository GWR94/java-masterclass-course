/**
 * Created by james on 25/05/2017.
 */
class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine()");
    }

    public void accelerate() {
        System.out.println("Car -> accelerate()");
    }


    public void slowDown() {
        System.out.println("Car -> slowDown()");
    }
}

class Polo extends Car {
    public Polo(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Polo -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Polo -> accelerate()");
    }

    @Override
    public void slowDown() {
        System.out.println("Polo -> slowDown()");
    }
}
class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford -> accelerate()");
    }

    @Override
    public void slowDown() {
        System.out.println("Ford -> slowDown()");
    }
}


public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
        Polo vwPolo = new Polo(8, "Volkswagen Polo");
        vwPolo.accelerate();
        car.accelerate();
        vwPolo.getName();
        Ford ford = new Ford(12, "Fiesta");
        ford.accelerate();


    }
}
