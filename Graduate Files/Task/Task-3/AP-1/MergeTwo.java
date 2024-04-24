// Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates. A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.


// mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
// mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
// mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]

import java.util.Arrays;
import java.util.TreeSet;

public class MergeTwo 
{
    public static String[] mergeTwo(String[] a, String[] b, int n) 
    {
        TreeSet<String> sets = new TreeSet<>();
        for(String s : a)
        {
            sets.add(s);
        }
        for(String s: b)
        {
            sets.add(s);
        }
        String[] merge = new String[n];
        for(int i=0;i<n; i++)
        {
            merge[i] = sets.pollFirst();
        }
        return merge;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(mergeTwo(new String[]{"a", "c", "z"}, new String[]{"b", "f", "z"}, 3)));
        System.out.println(Arrays.toString(mergeTwo(new String[]{"a", "c", "z"}, new String[]{"c", "f", "z"}, 3)));
        System.out.println(Arrays.toString(mergeTwo(new String[]{"f", "g", "z"}, new String[]{"c", "f", "g"}, 3)));
    }    
}
