
// Given a list of strings, return a list where each string has all its "x" removed.


// noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
// noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
// noX(["x"]) → [""]

import java.util.List;
import java.util.Arrays;

public class NoX 
{
    public static List<String> noX(List<String> strings) 
    {
        strings.replaceAll(n -> n.replaceAll("x", ""));
        return strings;
    }

    public static void main(String[] args) 
    {
        System.out.println(noX(Arrays.asList("ax", "bb", "cx")));
        System.out.println(noX(Arrays.asList("xxax", "xbxbx", "xxcx")));
        System.out.println(noX(Arrays.asList("x")));
    }    
}
