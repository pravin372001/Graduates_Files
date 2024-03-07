// Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".


// sameEnds("abXYab") → "ab"
// sameEnds("xx") → "x"
// sameEnds("xxx") → "x"

public class SameEnds 
{
    public static String sameEnds(String str) 
    {
        int len = str.length();
        String result = "";

        for (int i = 0; i < len / 2; i++) 
        {
            String sub1 = str.substring(0, i + 1);
            String sub2 = str.substring(len - 1 - i, len);

            if(sub1.equals(sub2)) 
            {
                result = sub1;
            }
        }
        return result;
    }

    public static void main(String[] args) 
    {
        System.out.println(sameEnds("abXYab"));    
    }
}
