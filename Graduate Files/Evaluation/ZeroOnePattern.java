import java.util.Scanner;

public class ZeroOnePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the row size: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == n - 1 || i == n - 1 || (i == n / 2 && j == n / 2)) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
