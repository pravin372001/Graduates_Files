// Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.


// maxBlock("hoopla") → 2
// maxBlock("abbCCCddBBBxx") → 3
// maxBlock("") → 0

public class MaxBlock 
{
    public static int maxBlock(String str) 
    {
        int count = 0;
        int max = 0;
        int j = 0;
        int i = 0;
        while(j<str.length())
        {
            if(str.charAt(i) == str.charAt(j))
            {
            count++;
            }
            else
            {
            max = Math.max(max, count);
            i = j;
            j = i-1;
            count = 0;
            }
            j++;
        }
        max = Math.max(max, count);
        return max;
    }
    public static void main(String[] args) 
    {
        System.out.println(maxBlock("hoopla"));    
    }    
}
