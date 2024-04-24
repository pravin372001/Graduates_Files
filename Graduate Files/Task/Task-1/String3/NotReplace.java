
// Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)


// notReplace("is test") → "is not test"
// notReplace("is-is") → "is not-is not"
// notReplace("This is right") → "This is not right"

public class NotReplace 
{
    public static String notReplace(String str) 
    {
        StringBuilder result = new StringBuilder();
        int length = str.length();

        for(int i = 0; i < length; i++) 
        {
            if (i - 1 >= 0 && Character.isLetter(str.charAt(i - 1)) || i + 2 < length && Character.isLetter(str.charAt(i + 2))) 
            {
                result.append(str.charAt(i));
            } 
            else if(i + 1 < length && str.startsWith("is", i)) 
            {
                result.append("is not");
                i++;
            } 
            else 
            {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
    public static void main(String[] args) 
    {
        System.out.println(notReplace("is test"));    
    }    
}
