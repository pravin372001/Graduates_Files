
// Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.


// repeatSeparator("Word", "X", 3) → "WordXWordXWord"
// repeatSeparator("This", "And", 2) → "ThisAndThis"
// repeatSeparator("This", "And", 1) → "This"

public class RepeatSeparator 
{
    public static String repeatSeparator(String word, String sep, int count) 
    {
        if(count == 1)
        {
            return word;
        }
        
        StringBuilder ans = new StringBuilder();
        
        for(int i=0; i<count; i++)
        {
            ans.append(word);
            if(i != count-1)
            {
            ans.append(sep);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) 
    {
        System.out.println(repeatSeparator("Word", "X", 3));    
    }    
}
