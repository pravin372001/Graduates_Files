import java.util.Scanner;

public class PowerN 
{
    public static int powerN(int n, int p)
    {
        if(p == 0)
        {
            return 1;
        }
        return n*powerN(n, p-1);
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.print("Enter the Power: ");
        int p = in.nextInt();
        System.out.println(powerN(n, p));   
        in.close();
    }    
}
