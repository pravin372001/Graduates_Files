package sort;
public class MergeSort implements Sortable {
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    public void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int left = start;
        int right = mid + 1;
        int i = 0;
        while (left <= mid && right <= end) {
            if (arr[left] < arr[right]) {
                temp[i] = arr[left];
                left++;
            } else {
                temp[i] = arr[right];
                right++;
            }
            i++;
        }
        while (left <= mid) {
            temp[i] = arr[left];
            left++;
            i++;
        }

        while (right <= end) {
            temp[i] = arr[right];
            right++;
            i++;
        }
        for (int j = 0; j < temp.length; j++) {
            arr[start + j] = temp[j];
        }
    }
}
