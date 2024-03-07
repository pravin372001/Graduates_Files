
// Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".


// mirrorEnds("abXYZba") → "ab"
// mirrorEnds("abca") → "a"
// mirrorEnds("aba") → "aba"

public class MirrorEnds 
{
    public static String mirrorEnds(String str) 
    {
        String result = "";
        int len = str.length();
        if(len == 0)
        {
            return "";
        }
        for(int i = 0; i<=len/2; i++)
        {
            if(str.charAt(i) == str.charAt(len-i-1))
            {
            result += str.charAt(i);
            }
            else
            {
            break;
            }
            if(i == len/2)
            {
            return str;
            }
        }
        return result;
    }

    public static void main(String[] args) 
    {
        System.out.println(mirrorEnds("abXYZba"));
    }    
}
