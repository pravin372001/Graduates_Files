import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestSumSubArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        int sum = 0;
        int max = 0;
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                if(sum > max){
                    max = sum;
                    temp.clear();
                    temp.addAll(result);
                    sum = 0;
                }
                result.clear();
            } else {
                result.add(arr[i]);
                sum += arr[i];
            }
        }
        if (sum > max) {
            max = sum;
        }
        System.out.println("Sum: " + max);
        System.out.println("Elements: " + temp);
        in.close();
    }

}
