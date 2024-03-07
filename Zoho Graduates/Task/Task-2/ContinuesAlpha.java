// Write a program to give the following output for the given input:
// Eg 1:  Input: a1b10
// Output: abbbbbbbbbb
// Eg: 2:  Input: b3c6d15
//            Output: bbbccccccddddddddddddddd
// The number varies from 1 to 99.

import java.util.Scanner;

public class ContinuesAlpha 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String output = "";
        int i = 0;
        while(input.length() > i) 
        {
            char current = input.charAt(i++);
            if(Character.isLetter(current))
            {
                int count = 0;
                while(i < input.length() && Character.isDigit(input.charAt(i)))
                {
                    count = count * 10 + (input.charAt(i++) - '0');
                }
                if(count == 0)
                {
                    count = 1;
                }
                for(int j = 0; j < count; j++)
                {
                    output = output + current;
                }
            }
        }
        System.out.println(output);
        in.close();
    }    
}
