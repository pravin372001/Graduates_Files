
// Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. The original array will contain at least "count" even numbers.


// copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
// copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
// copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]

import java.util.Arrays;

public class CopyEvens 
{
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(copyEvens(new int[]{3, 2, 4, 5, 8}, 2)));
        System.out.println(Arrays.toString(copyEvens(new int[]{3, 2, 4, 5, 8}, 3)));
        System.out.println(Arrays.toString(copyEvens(new int[]{6, 1, 2, 4, 5, 8}, 3)));
    }    
    public static int[] copyEvens(int[] nums, int count) 
    {
        int j = 0;
        int[] arr = new int[count];
        for(int i=0; i<nums.length && j<count; i++)
        {
            if(nums[i]%2 == 0)
            {
            arr[j++] = nums[i];
            }
        }
        return arr;
    }

}
