
// Given a string, return a string where for every char in the original, there are two chars.


// doubleChar("The") → "TThhee"
// doubleChar("AAbb") → "AAAAbbbb"
// doubleChar("Hi-There") → "HHii--TThheerree"


public class DoubleChar 
{
    public static String doubleChar(String str) 
    {
        StringBuilder res = new StringBuilder();
        for(char temp : str.toCharArray())
        {
            res.append(temp).append(temp);
        }
        return res.toString();
    }

      public static void main(String[] args) 
      {
          System.out.println(doubleChar("The"));
      }  
}
