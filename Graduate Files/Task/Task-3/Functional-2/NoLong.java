// Given a list of strings, return a list of the strings, omitting any string length 4 or more.


// noLong(["this", "not", "too", "long"]) → ["not", "too"]
// noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
// noLong(["cccc", "cccc", "cccc"]) → []

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class NoLong 
{
    public static List<String> noLong(List<String> strings) 
    {
        strings.removeIf(n -> n.length()>=4);
        return strings;
    }

    public static void main(String[] args) 
    {
        System.out.println(noLong(new ArrayList<>(Arrays.asList("this", "not", "too", "long"))));
        System.out.println(noLong(new ArrayList<>(Arrays.asList("a", "bbb", "cccc"))));
        System.out.println(noLong(new ArrayList<>(Arrays.asList("cccc", "cccc", "cccc"))));
    }    
}
