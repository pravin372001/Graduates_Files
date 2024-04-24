// Initialize a jagged array with N rows with weights of N persons. Each person can have different number of weights. Write
//       (i) A function to enter the weight of any user at any time.
//       (ii) A function to calculate the minimum weight of the nth person.

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = in.nextInt();
        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of weights for person " + (i + 1) + ": ");
            int m = in.nextInt();
            arr[i] = new int[m];
            for (int j = 0; j < m; j++) {
                System.out.print("Enter the weight " + (j + 1) + ": ");
                arr[i][j] = in.nextInt();
            }
        }
        minimumWeights(arr);
        in.close();
    }

    public static void minimumWeights(int[][] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            System.out.println("The minimum weight is for person " + (i + 1) + ": " + min);

        }
    }
}
