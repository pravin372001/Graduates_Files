
// Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


// stringX("xxHxix") → "xHix"
// stringX("abxxxcd") → "abcd"
// stringX("xabxxxcdx") → "xabcdx"

public class StringX 
{
    public static String stringX(String str) 
    {
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<str.length(); i++)
        {
            if((i==0 || i == str.length()-1) || str.charAt(i) != 'x')
            {
            ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) 
    {
        System.out.println(stringX("xxHxix"));    
        System.out.println(stringX("abxxxcd"));    
        System.out.println(stringX("xabxxxcdx"));    
    }    
}
