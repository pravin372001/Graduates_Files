
// Using Recursion, reverse the string such as
// Eg 1:  Input: one two three
//        Output: three two one
// Eg 2:  Input: I love india
//        Output: india love I


import java.util.Scanner;

public class ReverseRecursion 
{
    public static String reverse(String input)
    {
        int index = input.indexOf(" ");
        if(input.length() < 0 ||  index == -1)
        {
            return input;
        }
        return reverse(input.substring(index + 1)) + " " + input.substring(0, index);
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in); 
        String input = in.nextLine();
        System.out.println(reverse(input));   
        in.close();
    }    
}
