import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int arr[] = selectionSort(new int[]{5,4,3,2,1});
        long end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

}
