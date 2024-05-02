import java.util.List;

public class Lift {
    private Floor floor;
    private String liftNumber;
    private List<Floor> floorsStops;
    private int capcity;

    public Lift(String name, int floorNumber, List<Floor> floors) {
        floor = new Floor(0);
        liftNumber = name;
        floorsStops = floors;
        capcity = 5;
    }

    public Floor getFloor() {
        return floor;
    }

    public String getLiftNumber() {
        return liftNumber;
    }

    public List<Floor> getFloorsStops() {
        return floorsStops;
    }

    public int getCapcity() {
        return capcity;
    }

    public void setCapcity(int capcity) {
        this.capcity = capcity;
    }

    @Override
    public String toString() {
        return "Lift [floor=" + floor.getFloorNumber() + ", liftNumber=" + liftNumber + "]";
    }
}