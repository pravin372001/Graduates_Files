// Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)


// noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
// noZ(["hziz", "hzello", "hi"]) → ["hi"]
// noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class NoZ 
{
    public static List<String> noZ(List<String> strings) 
    {
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }

    public static void main(String[] args) 
    {
        System.out.println(noZ(new ArrayList<>(Arrays.asList("aaa", "bbb", "aza"))));
        System.out.println(noZ(new ArrayList<>(Arrays.asList("hziz", "hzello", "hi"))));
        System.out.println(noZ(new ArrayList<>(Arrays.asList("hello", "howz", "are", "youz"))));
    }    
}
