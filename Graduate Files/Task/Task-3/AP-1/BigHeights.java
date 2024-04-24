
// (A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, return the number of "big" steps for a walk starting at the start index and ending at the end index. We'll say that step is big if it is 5 or more up or down. The start end end index will both be valid indexes into the array with start <= end.


// bigHeights([5, 3, 6, 7, 2], 2, 4) → 1
// bigHeights([5, 3, 6, 7, 2], 0, 1) → 0
// bigHeights([5, 3, 6, 7, 2], 0, 4) → 1
public class BigHeights 
{
    public static int bigHeights(int[] heights, int start, int end) 
    {
        int bigSteps = 0;
            for(int i = start; i < end; i++) 
            {
                int diff = Math.abs(heights[i] - heights[i + 1]);
                if(diff >= 5) 
                {
                    bigSteps++;
                }
            }
            return bigSteps;
    }

    public static void main(String[] args) 
    {
        System.out.println(bigHeights(new int[]{5, 3, 6, 7, 2}, 2, 4));
        System.out.println(bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 1));
        System.out.println(bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 4));
    }    
}
