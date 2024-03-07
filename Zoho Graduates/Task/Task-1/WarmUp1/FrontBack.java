
// Given a string, return a new string where the first and last chars have been exchanged.


// frontBack("code") → "eodc"
// frontBack("a") → "a"
// frontBack("ab") → "ba"


public class FrontBack 
{
    public static String frontBack(String str) 
    {
        if(str.length() < 2)
        {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        char temp = sb.charAt(0);
        sb.setCharAt(0, sb.charAt(sb.length()-1));
        sb.setCharAt(sb.length()-1, temp);
        return sb.toString();
    }

    public static void main(String[] args) 
    {
        System.out.println(frontBack("code"));    
        System.out.println(frontBack("a"));    
        System.out.println(frontBack("ab"));    
    }    
}
