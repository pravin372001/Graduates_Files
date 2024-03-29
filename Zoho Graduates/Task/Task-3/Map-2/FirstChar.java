// Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.


// firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
// firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
// firstChar([]) → {}

import java.util.HashMap;
import java.util.Map;

public class FirstChar 
{
    public static Map<String, String> firstChar(String[] strings) 
    {
        Map<String, String> map = new HashMap<>();
        for(String s: strings)
        {
            map.put(s.substring(0, 1), map.getOrDefault(s.substring(0, 1), "")+s);
        }
        return map;
    }


    public static void main(String[] args) 
    {
        System.out.println(firstChar(new String[]{"salt", "tea", "soda", "toast"}));
        System.out.println(firstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));
        System.out.println(firstChar(new String[]{}));
    }    
}
