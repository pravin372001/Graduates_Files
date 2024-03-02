
// A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.


// getSandwich("breadjambread") → "jam"
// getSandwich("xxbreadjambreadyy") → "jam"
// getSandwich("xxbreadyy") → ""

public class GetSandwich 
{
    public static String getSandwich(String str) 
    {
        int firstIndex = str.indexOf("bread");
        int lastIndex = str.lastIndexOf("bread");
        
        if (firstIndex != lastIndex) 
        {
            return str.substring(firstIndex + 5, lastIndex);
        }
        return "";
        
    }

    public static void main(String[] args) 
    {
        System.out.println(getSandwich("breadjambread"));    
    }    
}
