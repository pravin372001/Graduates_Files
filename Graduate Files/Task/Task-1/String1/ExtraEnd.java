// Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.


// extraEnd("Hello") → "lololo"
// extraEnd("ab") → "ababab"
// extraEnd("Hi") → "HiHiHi"

public class ExtraEnd 
{
    public static String extraEnd(String str) 
    {
        String last = "";
        if(str.length() == 2)
        {
            last = str;
        }
        else
        {
            last = str.substring(str.length()-2);
        }
        return last+last+last;
    }

    public static void main(String[] args) 
    {
        System.out.println(extraEnd("Hello"));    
    }    
}
