import java.util.Scanner;

public class SecondOccurs
{
    public static void main(String[] args)
    {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println(secondOccurs(arr));
        in.close();
    }

    public static int secondOccurs(int[] arr)
    {
        int j = 0;
        int i = 0;
        while(i < arr.length)
        {
            if(arr[i] == arr[j] && i != j)
            {
                return j;
            }
            j++;
            if(j == arr.length)
            {
                j = 0;
                i++;
            }
        }
        return -1;
    }
}