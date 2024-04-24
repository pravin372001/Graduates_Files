package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sortable s = new MergeSort();
        // int[] arr = { 5, 4, 3, 2, 1, 9, 2, 8, 6, 3, 7 };
        // s.sort(arr);
        // System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("1. Bubble Sort\n2. Merge Sort\n3. Quick Sort");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                BubbleSort b = new BubbleSort();
                b.sort(arr);
                System.out.println(Arrays.toString(arr));
                break;
            case 2:
                s.sort(arr);
                System.out.println(Arrays.toString(arr));
                break;
            case 3:
                Quicksort q = new Quicksort();
                q.sort(arr);
                System.out.println(Arrays.toString(arr));
                break;
            default:
                System.out.println("Invalid choice");
        }
        scanner.close();
    }

}
