
// Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.


// mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
// mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
// mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}

import java.util.Map;
import java.util.HashMap;

public class MapAB4 
{
    public static Map<String, String> mapAB4(Map<String, String> map) 
    {
        if(map.containsKey("a") && map.containsKey("b"))
        {
            if(map.get("a").length()>map.get("b").length())
            {
                map.put("c", map.get("a"));
            }
            else if(map.get("a").length()<map.get("b").length())
            {
                map.put("c", map.get("b"));
            }
            else
            {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    public static void main(String[] args) 
    {
        System.out.println(mapAB4(new HashMap<String, String>(){{put("a", "aaa"); put("b", "bb"); put("c", "cake");}}));
        System.out.println(mapAB4(new HashMap<String, String>(){{put("a", "aa"); put("b", "bbb"); put("c", "cake");}}));
        System.out.println(mapAB4(new HashMap<String, String>(){{put("a", "aa"); put("b", "bbb");}}));
    }    
}
