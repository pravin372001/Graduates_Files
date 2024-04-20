public class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int meters;
    private int batteryPower = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return (batteryPower <= 0) ? true : false;
    }

    public int distanceDriven() {
        return meters;
    }

    public void drive() {
        if (batteryPower > 0) {
            meters += speed;
            batteryPower -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50, 4);
        return car;
    }
}

class RaceTrack {
    public int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (car.distanceDriven() < this.distance) {
            if (car.batteryDrained()) {
                return false;
            }
            car.drive();
        }
        return true;
    }
}