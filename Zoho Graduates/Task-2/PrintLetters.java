// Write a program to print a letters from the user input character to 'Z' without using
// strings.
// Example 1:  input : X
// Output : XYZ
// Example 2:  Input : M
// Output : MNOPQRSTUWXYZ


import java.util.Scanner;

public class PrintLetters 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = in.next().charAt(0);
        c = Character.toUpperCase(c);
        for(int i=c; i<=90; i++)
        {
            System.out.print((char)i+" ");
        }
        in.close();
    }
}
