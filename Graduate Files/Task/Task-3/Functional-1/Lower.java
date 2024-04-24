
// Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).


// lower(["Hello", "Hi"]) → ["hello", "hi"]
// lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
// lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]

import java.util.List;
import java.util.Arrays;

public class Lower 
{
    public static List<String> lower(List<String> strings) 
    {
        strings.replaceAll(n -> n.toLowerCase());
        return strings;
    }

    public static void main(String[] args) 
    {
        System.out.println(lower(Arrays.asList("Hello", "Hi")));
        System.out.println(lower(Arrays.asList("AAA", "BBB", "ccc")));
        System.out.println(lower(Arrays.asList("KitteN", "ChocolaTE")));
    }    
}
