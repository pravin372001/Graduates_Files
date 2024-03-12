
// Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.


// wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
// wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
// wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsWithout 
{
    public static String[] wordsWithout(String[] words, String target) 
    {
        List<String> al = new ArrayList<>();
        for(String word : words)
        {
            if(!word.equals(target))
            {
            al.add(word);
            }
        }
        return al.toArray(new String[0]);
    }

    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(wordsWithout(new String[]{"a", "b", "c", "a"}, "a")));
        System.out.println(Arrays.toString(wordsWithout(new String[]{"a", "b", "c", "a"}, "b")));
        System.out.println(Arrays.toString(wordsWithout(new String[]{"a", "b", "c", "a"}, "c")));
    }    
}
