import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MatrixSpiral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Random ran = new Random();
        int[] ar = new int[n*n];
        for(int i=0; i<n*n; i++){
            ar[i] = ran.nextInt(10);
        }
        // int[] arr = {8, 5, 3, 8, 6, 1, 2, 7, 4, 9, 0, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37};
        System.out.println(Arrays.toString(ar));
        printSpiral(ar, n);
    }

    private static void printSpiral(int[] arr, int n) {
        int[][] mat = new int[n][n];

        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int pointer = 0;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                if (pointer < arr.length) {
                    mat[top][i] = arr[pointer++];
                }
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                if (pointer < arr.length) {
                    mat[i][right] = arr[pointer++];
                }
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    if (pointer < arr.length) {
                        mat[bottom][i] = arr[pointer++];
                    }
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    if (pointer < arr.length) {
                        mat[i][left] = arr[pointer++];
                    }
                }
                left++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
