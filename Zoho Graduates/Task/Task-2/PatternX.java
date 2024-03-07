import java.util.Scanner;

public class PatternX 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String :");   
        String str = in.next();
        if(str.length()%2 != 1)
        {
            System.out.println("String length must be in odd number");
            in.close();
            return;
        }
        for(int i=0; i<str.length(); i++)
        {
            int len = str.length() - 1 - i;
            for(int j=0; j<str.length(); j++)
            {
                if(j == i || j == len)
                {
                    System.out.print(str.charAt(j));
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        in.close();
    }    
}
