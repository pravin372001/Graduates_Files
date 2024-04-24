
// Given a string, compute recursively a new string where all the 'x' chars have been removed.


// noX("xaxb") → "ab"
// noX("abc") → "abc"
// noX("xx") → ""

public class NoX 
{
    public static String noX(String str) 
    {
        if(str.isEmpty())
        {
            return str;
        }
        else if(str.charAt(0) == 'x')
        {
            return noX(str.substring(1));
        }
        return str.charAt(0)+noX(str.substring(1));
    }

    public static void main(String[] args) 
    {
        System.out.println(noX("xaxb"));
        System.out.println(noX("abc"));
        System.out.println(noX("xx"));    
    }    
}
