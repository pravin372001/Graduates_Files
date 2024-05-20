import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = bubbleSort(new int[]{5,4,2,1,3,6});
        System.out.println(Arrays.toString(arr));
    }

    private static int[] bubbleSort(int arr[]) {
        boolean swapped = false;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
}