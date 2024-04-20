
class Vehicle {
    private String make;
    private String model;
    private int year;
    private boolean isRunning;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isRunning = false;
    }

    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(make + " " + model + " " + year + " started.");
        } else {
            System.out.println(make + " " + model + " " + year + " is already running.");
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println(make + " " + model + " " + year + " stopped.");
        } else {
            System.out.println(make + " " + model + " " + year + " is already stopped.");
        }
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void start() {
        if (!isRunning()) {
            setRunning(true);
            System.out.println(getMake() + " " + getModel() + " " + getYear() + " started.");
        } else {
            System.out.println(getMake() + " " + getModel() + " " + getYear() + " is already running.");
        }
    }

    @Override
    public void stop() {
        if (isRunning()) {
            setRunning(false);
            System.out.println(getMake() + " " + getModel() + " " + getYear() + " started.");
        } else {
            System.out.println(getMake() + " " + getModel() + " " + getYear() + " is already running.");
        }
    }
}

// Truck class
class Truck extends Vehicle {
    private int maxLoad;

    // Constructor
    public Truck(String make, String model, int year, int maxLoad) {
        super(make, model, year);
        this.maxLoad = maxLoad;
    }

    // Overriding start method
    @Override
    public void start() {
        if (!isRunning()) {
            setRunning(true);
            System.out.println(getMake() + " " + getModel() + " " + getYear() + " started.");
        } else {
            System.out.println(getMake() + " " + getModel() + " " + getYear() + " is already running.");
        }
    }

    // Overriding stop method
    @Override
    public void stop() {
        if (isRunning()) {
            setRunning(false);
            System.out.println(getMake() + " " + getModel() + " " + getYear() + " started.");
        } else {
            System.out.println(getMake() + " " + getModel() + " " + getYear() + " is already running.");
        }
    }
}

// Main class
public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 4);
        car.start();
        car.stop();

        Truck truck = new Truck("Ford", "F-150", 2019, 2000);
        truck.start();
        truck.stop();
    }
}
