
// Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.


// endX("xxre") → "rexx"
// endX("xxhixx") → "hixxxx"
// endX("xhixhix") → "hihixxx"

public class EndX 
{
    public static String endX(String str) 
    {
        if(str.length()<=1)
        {
            return str;
        }
        if(str.charAt(0) == 'x')
        {
            return endX(str.substring(1)) + "x";
        }
        return str.charAt(0)+endX(str.substring(1));
    }

    public static void main(String[] args) 
    {
        System.out.println(endX("xxre"));    
        System.out.println(endX("xxhixx"));
        System.out.println(endX("xhixhix"));
    }    
}
