import java.util.Scanner;

public class Pattern5 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();

        // Upper part of the pattern
        for(int i = 1; i <= num; i++) 
        {
            for(int j = 1; j <= num - i; j++) 
            {
                System.out.print("*");
            }
            for(int k = 1; k <= 2 * i - 1; k++) 
            {
                System.out.print("_");
            }
            for(int j = 1; j <= num - i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for(int i = num - 1; i >= 1; i--) 
        {
            for(int j = 1; j <= num - i; j++) 
            {
                System.out.print("*");
            }
            for(int k = 1; k <= 2 * i - 1; k++) 
            {
                System.out.print("_");
            }
            for(int j = 1; j <= num - i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
