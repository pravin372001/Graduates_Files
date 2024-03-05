
// Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.


// strDist("catcowcat", "cat") → 9
// strDist("catcowcat", "cow") → 3
// strDist("cccatcowcatxx", "cat") → 9


public class StrDist 
{
    public static int strDist(String str, String sub) 
    {
        int strlen = str.length();
        int sublen = sub.length();
        
        if(strlen < sublen) 
        {
            return 0;
        }
        
        if(str.startsWith(sub) && str.endsWith(sub)) 
        {
            return strlen;
        }
        
        if(!str.startsWith(sub)) 
        {
            return strDist(str.substring(1), sub);
        }
        
        if(!str.endsWith(sub)) 
        {
            return strDist(str.substring(0, strlen - 1), sub);
        }
        
        return 0; 
    }

    public static void main(String[] args) 
    {
        System.out.println(strDist("catcowcat", "cat"));
        System.out.println(strDist("catcowcat", "cow"));
        System.out.println(strDist("cccatcowcatxx", "cat"));    
    }    
}
