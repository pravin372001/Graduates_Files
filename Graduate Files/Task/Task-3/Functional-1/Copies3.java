
// Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.


// copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
// copies3(["24", "a", ""]) → ["242424", "aaa", ""]
// copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
import java.util.List;
import java.util.Arrays;

public class Copies3 
{
    public static List<String> copies3(List<String> strings) 
    {
        strings.replaceAll(n -> n+n+n);
        return strings;
    }

    public static void main(String[] args) 
    {
        System.out.println(copies3(Arrays.asList("a", "bb", "ccc")));
        System.out.println(copies3(Arrays.asList("24", "a", "")));
        System.out.println(copies3(Arrays.asList("hello", "there")));
    }    
}
