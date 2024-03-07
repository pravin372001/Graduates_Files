import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElement 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = in.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < size; i++)
        {
            arr[i] = in.nextInt();
        }
        Set<Integer> sets = new HashSet<Integer>();
        for(int i = 0; i < size; i++)
        {
            if(!sets.add(arr[i]))
            {
                System.out.println(arr[i]);
            }
        }
        in.close();
    }    
}
