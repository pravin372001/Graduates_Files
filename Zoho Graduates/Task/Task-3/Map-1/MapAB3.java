// Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.


// mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
// mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
// mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}

import java.util.Map;
import java.util.HashMap;

public class MapAB3 
{
    public static Map<String, String> mapAB3(Map<String, String> map) 
    {
        if(map.containsKey("a") && map.containsKey("b"))
        {
            return map;
        }
        if(map.containsKey("a"))
        {
            map.put("b", map.get("a"));
            return map;
        }
        
        if(map.containsKey("b"))
        {
            map.put("a", map.get("b"));
        }
        return map;
    }

    public static void main(String[] args) 
    {
        System.out.println(mapAB3(new HashMap<String, String>(){{put("a", "aaa"); put("c", "cake");}}));
        System.out.println(mapAB3(new HashMap<String, String>(){{put("b", "bbb"); put("c", "cake");}}));
        System.out.println(mapAB3(new HashMap<String, String>(){{put("a", "aaa"); put("b", "bbb"); put("c", "cake");}}));
    }    
}
