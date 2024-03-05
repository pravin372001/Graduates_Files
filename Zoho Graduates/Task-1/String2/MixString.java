
// Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


// mixString("abc", "xyz") → "axbycz"
// mixString("Hi", "There") → "HTihere"
// mixString("xxxx", "There") → "xTxhxexre"


public class MixString 
{
    public static String mixString(String a, String b) 
    {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int len = Math.min(a.length(), b.length());
        
        for (i = 0; i < len; i++) 
        {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }
        
        if(a.length() > b.length()) 
        {
            result.append(a.substring(i));
        } 
        else
        {
            result.append(b.substring(i));
        }
        
        return result.toString();
    }

    public static void main(String[] args) 
    {
        System.out.println(mixString("abc", "xyz"));    
    }    
}
