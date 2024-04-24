package sort;

public class BubbleSort implements Sortable {
    public void sort(int[] arr) {
        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
