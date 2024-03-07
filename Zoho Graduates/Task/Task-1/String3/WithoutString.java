
// Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".


// withoutString("Hello there", "llo") → "He there"
// withoutString("Hello there", "e") → "Hllo thr"
// withoutString("Hello there", "x") → "Hello there"

public class WithoutString 
{
    public static String withoutString(String base, String remove) 
    {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < base.length()) 
        {
            if (i <= base.length() - remove.length() && base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) 
            {
                i += remove.length();
            } 
            else 
            {
                result.append(base.charAt(i));
                i++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) 
    {
        System.out.println(withoutString("Hello there", "llo"));    
    }    
}
