import java.util.Scanner;

public class SeatPosition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the seat number: ");
        int seatNumber = in.nextInt();

        seatNumber = seatNumber % 6;
        // System.out.println(seatNumber);
        switch (seatNumber) {
            case 0:
            case 1:
                System.out.println("Window Seat (WS)");
                break;
            case 2:
            case 5:
                System.out.println("Middle Seat (MS)");
                break;

            case 3:
            case 4:
                System.out.println("Aisle Seat (AS)");
                break;
        }
        in.close();
    }
}