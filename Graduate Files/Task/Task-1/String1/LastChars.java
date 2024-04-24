
// Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.


// lastChars("last", "chars") → "ls"
// lastChars("yo", "java") → "ya"
// lastChars("hi", "") → "h@"


public class LastChars 
{
    public static String lastChars(String a, String b) 
    {
        String res = "";
        if(a.length() != 0)
        {
            res += a.substring(0,1);
        }
        else
        {
            res += "@";
        }
        if(b.length() != 0)
        {
            res += b.substring(b.length()-1);
        }
        else
        {
            res += "@";
        }
        return res;
    }

    public static void main(String[] args) 
    {
        System.out.println(lastChars("last", "chars"));    
    }    
}
