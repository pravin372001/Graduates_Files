// We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult than it looks.


// firstSwap(["ab", "ac"]) → ["ac", "ab"]
// firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
// firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class FirstSwap 
{
    public static String[] firstSwap(String[] strings) 
    {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<strings.length; i++)
        {
            String firstChar = strings[i].substring(0,1);
            
            if(map.containsKey(firstChar))
            {
            int prevIndex = map.get(firstChar);
            if (prevIndex >= 0 && prevIndex < strings.length && strings[prevIndex].substring(0,1).equals(firstChar))
            {
                int index = map.get(firstChar);
                String temp = strings[index];
                strings[index] = strings[i];
                strings[i] = temp;
                map.put(firstChar, -1);
            }
            }
            else
            {
            map.put(firstChar, i);
            }
        }
        return strings;
    }

    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(firstSwap(new String[]{"ab", "ac"})));
        System.out.println(Arrays.toString(firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));
        System.out.println(Arrays.toString(firstSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})));
    }    
}
