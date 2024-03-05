
// Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.


// plusOut("12xy34", "xy") → "++xy++"
// plusOut("12xy34", "1") → "1+++++"
// plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"

public class PlusOut 
{
    public static String plusOut(String str, String word) 
    {
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<str.length(); i++)
        {
            if(i <= str.length() - word.length() && str.substring(i, i+word.length()).equals(word))
            {
            ans.append(word);
            i += word.length() - 1;
            }
            else
            {
            ans.append("+");
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) 
    {
        System.out.println(plusOut("12xy34", "xy"));    
    }    
}
