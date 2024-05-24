import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PrintDiagonal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int arr[][] = new int[n][n];
        int N = n * 2 - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        printDiagonal(arr, N, n);
    }

    private static void printDiagonal(int[][] arr, int N, int n) {
        List<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            res.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res.get(i + j).add(arr[i][j]);
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(res.get(i));
        }
    }
}