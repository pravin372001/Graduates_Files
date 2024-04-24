import java.util.Scanner;

public class PairStar 
{
    public static String pairStar(String s)
    {
        if(s.length()<=1)
        {
            return s;
        }
        if(s.charAt(0) == s.charAt(1))
        {
            return s.charAt(0) + "*" + pairStar(s.substring(1));
        }
        return s.charAt(0)+pairStar(s.substring(1));
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(pairStar(s));
        in.close();
    }    
}
