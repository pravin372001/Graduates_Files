// Create a program that rotates the elements of an array to the right by a specified number of positions. Get the array and the rotation count from the user


import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the number of times to rotate the array: ");
        int k = in.nextInt();
        rotateArray(arr, n, k);
        in.close();
    }

    public static void rotateArray(int[] arr, int n, int k) {
        k = k % n;
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
        reverseArray(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
