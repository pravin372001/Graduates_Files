import java.util.Scanner;

public class Pattern2 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = in.nextInt();
        int temp = n;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<i; j++)
            {
                System.out.print(" ");
            }
            for(int j=i; j<=n; j++)
            {
                System.out.print(temp+" ");
            }
            temp--;
            System.out.println();
        }  
        in.close();  
    }    
}
