import java.util.Scanner;

public class NumberEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = scanner.nextInt();
        System.out.print("Enter the result number :");
        int res = scanner.nextInt();

        if (recursiveHelper(num, res, 0)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        scanner.close();
    }

    public static boolean recursiveHelper(int num, int res, int ans) {
        if (num == 0) {

            return res == ans;
        }

        int digit = num % 10;

        boolean take = recursiveHelper(num / 10, res, ans + digit) ||
                recursiveHelper(num / 10, res, ans - digit) ||
                recursiveHelper(num / 10, res, ans * digit) ||
                (digit != 0 && ans % digit == 0 && recursiveHelper(num / 10, res, ans / digit));

        boolean notTake = recursiveHelper(num / 10, res, ans);

        return take || notTake;
    }
}
