
// Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later, but for this problem the value is simply 0.


// word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
// word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
// word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}

import java.util.Map;
import java.util.HashMap;

public class Word0 
{
    public static Map<String, Integer> word0(String[] strings) 
    {
        Map<String, Integer> map = new HashMap<>();
        for(String word: strings)
        {
            map.put(word, 0);
        }
        return map;
    }

    public static void main(String[] args) 
    {
        System.out.println(word0(new String[]{"a", "b", "a", "b"}));
        System.out.println(word0(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(word0(new String[]{"c", "b", "a"}));
    }    
}
