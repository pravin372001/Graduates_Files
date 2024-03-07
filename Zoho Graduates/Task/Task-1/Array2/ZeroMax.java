
// Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.


// zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
// zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
// zeroMax([0, 1, 0]) → [1, 1, 0]

import java.util.Arrays;

public class ZeroMax 
{
    public static int[] zeroMax(int[] nums) 
    {
        int maxOdd = 0;
        
        for(int i = nums.length - 1; i >= 0; i--) 
        {
            if(nums[i] % 2 != 0) 
            {
            maxOdd = Math.max(maxOdd, nums[i]);
            }
            if(nums[i] == 0) 
            {
            nums[i] = maxOdd;
            }
        }
        return nums;
    }

    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(zeroMax(new int[]{0, 5, 0, 3})));    
    }    
}
