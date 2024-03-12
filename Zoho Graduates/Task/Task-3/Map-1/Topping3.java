
// Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".


// topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
// topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
// topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
import java.util.Map;   
import java.util.HashMap; 

public class Topping3 
{
    public static Map<String, String> topping3(Map<String, String> map) 
    {
        if(map.containsKey("potato"))
        {
            map.put("fries", map.get("potato"));
        }
        if(map.containsKey("salad"))
        {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

    public static void main(String[] args) 
    {
        System.out.println(topping3(new HashMap<String, String>(){{put("potato", "ketchup");}}));
        System.out.println(topping3(new HashMap<String, String>(){{put("potato", "butter");}}));
        System.out.println(topping3(new HashMap<String, String>(){{put("salad", "oil"); put("potato", "ketchup");}}));
    }    
}
