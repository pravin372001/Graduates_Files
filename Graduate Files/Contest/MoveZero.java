import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[k++] = arr[i];
            }
        }

        for (int i = k; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
