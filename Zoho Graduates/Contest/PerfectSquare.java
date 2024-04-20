import java.util.InputMismatchException;

public class PerfectSquare {
    public static void main(String[] args) {
        int input = 80;
        System.out.println(isPerfect(input));
        // System.out.println(recursive(input, 0));
    }

    private static boolean isPerfect(int input) {
        double out = Math.sqrt(input);
        int temp = (int) out;
        return temp * temp == input;
    }

    private static int recursive(int input, int count) {
        if (isPerfect(input)) {
            return count;
        }

        if (input == 0) {
            return -1;
        }
        try {

        } catch (ArithmeticException | InputMismatchException e) {
            
        }
        return recursive(input / 10, count++) + recursive(input, count);
    }
}
