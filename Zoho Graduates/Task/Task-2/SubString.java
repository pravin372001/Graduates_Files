import java.util.Scanner;

public class SubString 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        System.out.println(input1.indexOf(input2));
        in.close();
    }    
}
