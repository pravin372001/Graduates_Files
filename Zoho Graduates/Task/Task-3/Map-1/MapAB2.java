
// Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.


// mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
// mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
// mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}

import java.util.Map;
import java.util.HashMap;

public class MapAB2 
{
    public static Map<String, String> mapAB2(Map<String, String> map) 
    {
        if(map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b")))
        {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    public static void main(String[] args) 
    {
        System.out.println(mapAB2(new HashMap<String, String>(){{put("a", "aaa"); put("b", "aaa"); put("c", "cake");}}));
        System.out.println(mapAB2(new HashMap<String, String>(){{put("a", "aaa"); put("b", "bbb");}}));
        System.out.println(mapAB2(new HashMap<String, String>(){{put("a", "aaa"); put("b", "bbb"); put("c", "aaa");}}));
    }    
}
