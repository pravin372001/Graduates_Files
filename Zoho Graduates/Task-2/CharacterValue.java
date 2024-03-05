// Program to Find ASCII Value of a Character

import java.util.Scanner;

public class CharacterValue 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = in.next().charAt(0);
        System.out.println("Value of " + c + " is " + (int)c);   
        in.close(); 
    }    
}
