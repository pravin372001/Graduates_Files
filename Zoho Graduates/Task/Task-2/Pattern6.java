// Write a program to make such a pattern like a pyramid with numbers increased by 1.
// Eg:  Input : 10
// Output:
//      1
//     2 3
//   4 5 6
// 7 8 9 10



import java.util.Scanner;

public class Pattern6 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int temp = 1;
        for(int i=0; i<num; i++)
        {
            for(int j=0; j<num-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++)
            {
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
        in.close();
    }    
}
