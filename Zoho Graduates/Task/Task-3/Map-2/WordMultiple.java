// Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.


// wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
// wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
// wordMultiple(["c", "c", "c", "c"]) → {"c": true}

import java.util.HashMap;
import java.util.Map;

public class WordMultiple 
{
    public static Map<String, Boolean> wordMultiple(String[] strings) 
    {
        Map<String, Boolean> map = new HashMap<>();
        Map<String, Integer> count = new HashMap<>(); 
        for(String word: strings)
        {
            count.put(word, count.getOrDefault(word, 0)+1);
        }
        for(Map.Entry<String,Integer> entry : count.entrySet())
        {
            if(entry.getValue()>=2)
            {
                map.put(entry.getKey(), true);
            }
            else
            {
                map.put(entry.getKey(), false);
            }
        }
        return map;
    }

    public static void main(String[] args) 
    {
        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordMultiple(new String[]{"c", "b", "a"}));
        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
    }    
}
