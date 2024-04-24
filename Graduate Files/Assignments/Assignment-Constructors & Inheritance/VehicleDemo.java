class Vehicle {
    public int noOfWheels;
    public int noOfPassengers;
    public String color;
    public String brand;

    public Vehicle(int noOfWheels, int noOfPassengers, String color, String brand) {
        this.noOfWheels = noOfWheels;
        this.noOfPassengers = noOfPassengers;
        this.color = color;
        this.brand = brand;

    }
}

class Car extends Vehicle {
    public String StrokeType;

    public Car(int noOfWheels, int noOfPassengers, String color, String brand, String StrokeType) {
        super(noOfWheels, noOfPassengers, color, brand);
        this.StrokeType = StrokeType;
        display();
    }

    public void display() {
        System.out.println("noOfWheels:" + noOfWheels + "\nnoOfPassengers:" + noOfPassengers + "\ncolor:" + color
                + "\nbrand:" + brand + "\nStrokeType:" + StrokeType);
    }

}

class Truck extends Vehicle {
    public String StrokeType;

    public Truck(int noOfWheels, int noOfPassengers, String color, String brand, String StrokeType) {
        super(noOfWheels, noOfPassengers, color, brand);
        this.StrokeType = StrokeType;
        display();
    }

    public void display() {
        System.out.println("noOfWheels:" + noOfWheels + "\nnoOfPassengers:" + noOfPassengers + "\ncolor:" + color
                + "\nbrand:" + brand + "\nStrokeType:" + StrokeType);
    }
}

class Bike extends Vehicle {
    public String StrokeType;

    public Bike(int noOfWheels, int noOfPassengers, String color, String brand, String StrokeType) {
        super(noOfWheels, noOfPassengers, color, brand);
        this.StrokeType = StrokeType;
    }

    public void display() {
        System.out.println("noOfWheels:" + noOfWheels + "\nnoOfPassengers:" + noOfPassengers + "\ncolor:" + color
                + "\nbrand:" + brand + "\nStrokeType:" + StrokeType);
    }
}

public class VehicleDemo {

    public static void main(String[] args) {
        
        Vehicle c = new Car(4, 5, "black", "honda", "front");
        System.out.println("\nTruck");
        Vehicle t = new Truck(6, 5, "red", "bmw", "front");

    }
}
