import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long num = in.nextLong();
            System.out.println("Number: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Phone number is not valid");
        }
    }
}
