// Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.


// wordAppend(["a", "b", "a"]) → "a"
// wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
// wordAppend(["a", "", "a"]) → "a"

import java.util.HashMap;
import java.util.Map;

public class WordAppend 
{
    public static String wordAppend(String[] strings) 
    {
        StringBuilder ans = new StringBuilder();
        Map<String, Integer> maps = new HashMap<>();
        for(String word : strings)
        {
            if(!word.isEmpty())
            {
            int count = maps.getOrDefault(word, 0);
            count++;
            maps.put(word, count);
            if(count%2 == 0)
            {
                ans.append(word);
            }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) 
    {
        System.out.println(wordAppend(new String[]{"a", "b", "a"}));
        System.out.println(wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(wordAppend(new String[]{"a", "", "a"}));
    }    
}
