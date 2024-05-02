import java.util.*;

public class Block {
    private List<Floor> floorLists = new LinkedList<Floor>();
    private List<Lift> liftLists = new LinkedList<Lift>();
    private String name;
    private static Block block;

    private Block() {

    }

    public static Block getBlock(String blockName) {
        if (block == null) {
            block = new Block();
            block.initFloor();
            block.initLift();
            block.name = blockName;
        }
        return block;
    }

    public void initFloor() {
        floorLists.add(new Floor(1));
        floorLists.add(new Floor(2));
        floorLists.add(new Floor(3));
        floorLists.add(new Floor(4));
        floorLists.add(new Floor(5));
        floorLists.add(new Floor(6));
        floorLists.add(new Floor(7));
        floorLists.add(new Floor(8));
        floorLists.add(new Floor(9));
        floorLists.add(new Floor(10));
    }

    public void initLift() {
        liftLists.add(new Lift("L1", 0, new ArrayList<>(
                Arrays.asList(new Floor(0), new Floor(1), new Floor(2), new Floor(3), new Floor(4), new Floor(5)))));
        liftLists.add(new Lift("L2", 0, new ArrayList<>(
                Arrays.asList(new Floor(0), new Floor(1), new Floor(2), new Floor(3), new Floor(4), new Floor(5)))));
        liftLists.add(new Lift("L3", 0, new ArrayList<Floor>(
                Arrays.asList(new Floor(0), new Floor(6), new Floor(7), new Floor(8), new Floor(9), new Floor(10)))));
        liftLists.add(new Lift("L4", 0, new ArrayList<Floor>(
                Arrays.asList(new Floor(0), new Floor(6), new Floor(7), new Floor(8), new Floor(9), new Floor(10)))));
        liftLists.add(new Lift("L5", 0, new ArrayList<Floor>(Arrays.asList(new Floor(1), new Floor(1), new Floor(2),
                new Floor(3), new Floor(4), new Floor(5), new Floor(6), new Floor(7), new Floor(8), new Floor(9),
                new Floor(10)))));
    }

    public List<Floor> getFloorLists() {
        return floorLists;
    }

    public List<Lift> getLiftLists() {
        return liftLists;
    }

    public String getName() {
        return name;
    }

    public Lift getLift(int[] input) {
        List<Lift> list = liftLists;
        Collections.sort(list, new Comparator<Lift>() {
            public int compare(Lift lhs, Lift rhs) {
                return Math.abs(lhs.getFloor().getFloorNumber() - input[0])
                        - Math.abs(rhs.getFloor().getFloorNumber() - input[0]);
            }
        });

        // System.out.println("sorted"+ list);
        // System.exit(0);
        for (Lift l : list) {
            for (Floor floor : l.getFloorsStops()) {
                if (floor.getFloorNumber() == input[1]) {
                    return l;
                }
            }
        }
        return null;
    }

    public void updateLift(Lift lift) {
        Lift l = lift;
        Iterator<Lift> it = liftLists.iterator();
        while (it.hasNext()) {
            Lift l1 = it.next();
            if (l1.getLiftNumber().equals(l.getLiftNumber())) {
                l1.getFloor().setFloorNumber(l.getFloor().getFloorNumber());
                l1.setCapcity(l1.getCapcity() - 1);
            }
        }
    }

    public void setLiftMaintence(String liftNumber) {
        Iterator<Lift> iterator = liftLists.iterator();
        while (iterator.hasNext()) {
            Lift l1 = iterator.next();
            if (l1.getLiftNumber().equals(liftNumber)) {
                l1.getFloor().setFloorNumber(-1);
                System.out.println("Successfully set for maintenance");
            } else {
                System.out.println("Unable to set for maintenance");
            }
        }
    }

    public void unSetLiftMaintence(String liftNumber) {
        Iterator<Lift> iterator = liftLists.iterator();
        while (iterator.hasNext()) {
            Lift l1 = iterator.next();
            if (l1.getLiftNumber().equals(liftNumber) && l1.getFloor().getFloorNumber() == -1) {
                l1.getFloor().setFloorNumber(0);
                System.out.println("Successfully unset");
            } else {
                System.out.println("Lift is not in maintenance mode");
            }
        }
    }

}
