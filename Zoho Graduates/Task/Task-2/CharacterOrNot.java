// Program to Check Whether a Character is an Alphabet or not

import java.util.Scanner;

public class CharacterOrNot 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Character :");
        char c = in.next().charAt(0);
        System.out.println("Given Character is "+c+" "+Character.isLetter(c));
        in.close();
    }       
}
