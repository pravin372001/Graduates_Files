import java.util.Arrays;
import java.util.Scanner;

public class CopyArray 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size = in.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++)
        {   
            array[i] = in.nextInt();
        }
        int []cp = new int[array.length];
        for(int i = 0; i < cp.length; i++)
        {
            cp[i] = array[i];
        }
        System.out.println(Arrays.toString(cp));
        in.close();
    }    
}
