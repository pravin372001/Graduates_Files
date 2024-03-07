import java.util.Scanner;

public class NestParen 
{
    public static boolean nestParen(String s)
    {  
        if(s.length() == 0)
        {
            return true;
        }
        if(s.charAt(0) == '(' && s.charAt(s.length()-1) == ')')
        {
            return nestParen(s.substring(1, s.length()-1));
        }
        return false;
    } 
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(nestParen(s));  
        in.close();   
    }   
}
