import java.util.Scanner;

public class Pattern4
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = in.nextInt();
        int m = n;
        for(int i=1; i<=n; i++)
        {
            for(int j=i; j<n; j++)
            {
                System.out.print("  ");
            }

            for(int j=1; j<=2*i-1; j++)
            {
                System.out.print(m+" ");
                if(j<i)
                {
                    m++;
                }
                else
                {
                    m--;
                }
            }
            System.out.println();
        }    
        in.close();
    }    
}
