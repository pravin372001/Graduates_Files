import java.util.Scanner;

public class SmallestElement 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size = in.nextInt();
        int[] array = new int[size];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++)
        {
            int value = in.nextInt();
            array[i] = value;
            min = Math.min(min, value);
        }    
        System.out.println("Minimum is :"+min);
        in.close();
    }    
}
