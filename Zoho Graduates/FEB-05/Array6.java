import java.util.Scanner;

public class Array6 
{
    public static boolean array6(int[] a, int i)
    {
        if(i == a.length)
        {
            return false;
        }
        if(a[i] == 6)
        {
            return true;
        }
        return array6(a, i+1);
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = in.nextInt();
        }    
        System.out.println(array6(a, 0));
        in.close();
    }    
}
