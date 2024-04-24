import java.util.Arrays;
import java.util.Scanner;

public class HugeNumberAddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the number 1 :");
        int size1 = in.nextInt();
        System.out.print("Enter the number 1 in array:");
        int num1[] = new int[size1];
        for (int i = 0; i < size1; i++) {
        num1[i] = in.nextInt();
        }
        System.out.print("Enter the size of the number 2 :");
        int size2 = in.nextInt();
        System.out.print("Enter the number 2 in array:");
        int num2[] = new int[size2];
        for (int i = 0; i < size2; i++) {
        num2[i] = in.nextInt();
        }
        int carry = 0;
        int sum = 0;
        int[] ans = new int[Math.max(size1, size2)];
        int i = size1 - 1;
        int j = size2 - 1;
        int k = Math.max(size1, size2) - 1;
        while (i >= 0 && j >= 0) {
            sum = num2[j] + num1[i] + carry;
            System.out.println(sum);
            if (sum > 9) {
                carry = 1;
                ans[k--] = sum % 10;
            } else {
                carry = 0;
                ans[k--] = sum;
            }
            i--;
            j--;
        }

        while (i >= 0) {
            ans[k--] = num1[i];
            i--;
        }

        while (j >= 0) {
            ans[k--] = num2[j];
            i--;
        }

        System.out.println(Arrays.toString(ans));
        in.close();
    }
}
