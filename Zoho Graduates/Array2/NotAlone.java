
// We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.


// notAlone([1, 2, 3], 2) → [1, 3, 3]
// notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
// notAlone([3, 4], 3) → [3, 4]

import java.util.Arrays;

public class NotAlone 
{
    public static int[] notAlone(int[] nums, int value) 
    {
        for(int i = 1; i < nums.length - 1; i++) 
        {
            if(nums[i] == value && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) 
            {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }

    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(notAlone(new int[]{1, 2, 3}, 2)));    
    }    
}
