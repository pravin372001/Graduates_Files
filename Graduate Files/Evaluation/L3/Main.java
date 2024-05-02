import java.util.*;

public class Main {
    public static Block block = Block.getBlock("ZSGS");

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
        main.print();
    }

    private void setMaintence() {
        System.out.print("Enter the lift number to set maintence :");
        String liftNumber = in.next();
        block.setLiftMaintence(liftNumber);
    }

    public int[] input() {
        System.out.print("Curent Floor: ");
        int current = in.nextInt();
        System.out.print("Destination: ");
        int destination = in.nextInt();
        return new int[] { current, destination };
    }

    public void print() {
        System.out.print("Lift: ");
        List<Lift> lifts = block.getLiftLists();
        Collections.sort(lifts, new Comparator<Lift>() {
            public int compare(Lift l1, Lift l2) {
                return Integer.parseInt(l1.getLiftNumber().substring(1))
                        - Integer.parseInt(l2.getLiftNumber().substring(1));
            }
        });
        for (Lift l : lifts) {
            System.out.print(l.getLiftNumber() + " ");
        }
        System.out.println();
        System.out.print("Floor :");
        for (Lift floor : lifts) {
            System.out.print(floor.getFloor().getFloorNumber() + "  ");
        }
        System.out.println();
    }

    public void start() {
        try {
            while (true) {
                System.out.println("Enter 0 to maintence\nEnter 1 to lift simulation\n");
                System.out.print("Enter the option :");
                int n = in.nextInt();
                if (n == 0) {
                    while (true) {
                        System.out.print("Enter 1 to set maintenance mode\nEnter 2 to unset maintenance\n0 to back\n");
                        System.out.print("Enter the option :");
                        int set = in.nextInt();
                        if (set == 1) {
                            setMaintence();
                        } else if (set == 2) {
                            unsetMaintence();
                        } else if (set == 0) {
                            break;
                        } else {
                            System.out.println("Enter the correct value");
                        }
                    }
                } else if (n == 1) {
                    while (true) {
                        print();
                        int[] input = input();
                        if (input[0] < 0 || input[1] < 0) {
                            System.out.println("Input must be positive");
                            break;
                        }
                        Lift lift = block.getLift(input);
                        if (lift != null) {
                            lift.getFloor().setFloorNumber(input[1]);
                            block.updateLift(lift);
                        }
                        System.out.println();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void unsetMaintence() {
        System.out.println("Enter the lift number to set maintence :");
        String liftNumber = in.next();
        block.unSetLiftMaintence(liftNumber);
    }

}
