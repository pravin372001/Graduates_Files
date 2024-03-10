import java.util.Scanner;

public class EvenSum 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println(evenSum(arr));    
        in.close();
    }    
    public static int evenSum(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                sum += arr[i];
            }
        }
        return sum;
    }
}
