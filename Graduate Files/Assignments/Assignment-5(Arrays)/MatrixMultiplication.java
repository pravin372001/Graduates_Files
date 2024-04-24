import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the first matrix: ");
        int n = in.nextInt();
        int[][] arr1 = new int[n][n];
        System.out.print("Enter the elements of the first matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = in.nextInt();
            }
        }
        int[][] arr2 = new int[n][n];
        System.out.print("Enter the elements of the second matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = in.nextInt();
            }
        }
        int[][] arr3 = new int[n][n];
        multiply(arr1, arr2, arr3, n);
        in.close();
    }

    public static void multiply(int[][] arr1, int[][] arr2, int[][] arr3, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("The product of the two matrices is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
