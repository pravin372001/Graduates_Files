// Write a program to find the sum of the series. The series will be like 1 +11 + 111 +
// 1111 +.. n terms.
// Eg 1: Input:  Input the number of terms : 5
// Output :
// 1 + 11 + 111 + 1111 + 11111
// The Sum is : 12345
// Eg 2: Input:  Input the number of terms : 3
// Output :
// 1 + 11 + 111
// The Sum is : 123



import java.util.Scanner;

public class SumSeries 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int temp = 1;
        int sum = 0;
        while(num-- > 0)
        {
            sum = sum +temp;
            temp = temp * 10 + 1;
        }
        System.out.println("The Sum is: "+sum);
        in.close();
    }    
}
