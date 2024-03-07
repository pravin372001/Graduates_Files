import java.util.Scanner;

public class ParenBit 
{
    public static String parenBit(String str)
    {
        int start = str.indexOf("(");
        int end = str.lastIndexOf(")");
        if(start == -1 || end == -1)
        {
            return "";
        }
        return str.substring(start, end+1);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the String: ");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(parenBit(s));
        in.close();
    }    
}
