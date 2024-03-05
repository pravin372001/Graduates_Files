// Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".


// lastTwo("coding") → "codign"
// lastTwo("cat") → "cta"
// lastTwo("ab") → "ba"


public class LastTwo 
{
    public static String lastTwo(String str) 
    {
        if(str.length() < 2)
        {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        char lastChar = sb.charAt(sb.length() - 1);
        char secondLastChar = sb.charAt(sb.length() - 2);
        sb.setCharAt(sb.length() - 1, secondLastChar);
        sb.setCharAt(sb.length() - 2, lastChar);
        return sb.toString();
    }

    public static void main(String[] args) 
    {
        System.out.println(lastTwo("coding"));    
    }    
}
