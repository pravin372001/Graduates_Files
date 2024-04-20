import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row size :");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < (2 * n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
