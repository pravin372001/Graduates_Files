// Given an array of strings, return the count of the number of strings with the given length.


// wordsCount(["a", "bb", "b", "ccc"], 1) → 2
// wordsCount(["a", "bb", "b", "ccc"], 3) → 1
// wordsCount(["a", "bb", "b", "ccc"], 4) → 0

public class WordsCount 
{
    public static int wordsCount(String[] words, int len) 
    {
        int count = 0;
        for(String word : words)
        {
            if(word.length() == len)
            {
            count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        System.out.println(wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1));
        System.out.println(wordsCount(new String[]{"a", "bb", "b", "ccc"}, 3));
        System.out.println(wordsCount(new String[]{"a", "bb", "b", "ccc"}, 4));    
    }    
}
