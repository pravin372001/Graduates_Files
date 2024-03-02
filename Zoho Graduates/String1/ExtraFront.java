
// Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.


// extraFront("Hello") → "HeHeHe"
// extraFront("ab") → "ababab"
// extraFront("H") → "HHH"


public class ExtraFront 
{
    public static String extraFront(String str) 
    {
        if(str.length() < 3)
        {
            return str+str+str;
        }
        return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
    }

    public static void main(String[] args) 
    {
        System.out.println(extraFront("Hello"));    
    }    
}
