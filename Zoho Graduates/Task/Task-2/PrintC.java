// Write a program to print the alphabet 'C' with the stars based on the given numbers
// Eg 1:  Input: 4
//         Output:
// ****
// *
// *
// ****
import java.util.Scanner;
public class PrintC 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = in.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==1 || j==1 || i==n)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        in.close();
    }    
}
