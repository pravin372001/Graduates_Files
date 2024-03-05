// Write a program to display the number in reverse order without use of String
// functions.
// Eg 1:  Input: 12345
// Output :The number in reverse order is : 54321

import java.util.Scanner;

public class ReverseNumber 
{
    public static int reverse(int number)
    {
        int reverse = 0;
        while(number > 0)
        {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        return reverse;
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("The number in reverse order is : " + reverse(number));
        in.close();
    }    
}
