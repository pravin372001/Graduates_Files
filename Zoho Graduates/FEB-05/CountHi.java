import java.util.Scanner;

public class CountHi 
{
    public static int countHi(String str)
    {
        if(str.length()<=1)
        {
            return 0;
        }
        if(str.substring(0, 2).equals("hi"))
        {
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = in.next();    
        System.out.println(countHi(s));
        in.close();
    }    
}
