// Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)


// splitArray([2, 2]) → true
// splitArray([2, 3]) → false
// splitArray([5, 2, 3]) → true

public class SplitArray 
{
    public static boolean splitArray(int[] nums) 
    {
        return split(0, nums, 0, 0);
    }

    private static boolean split(int start, int[] nums, int group1, int group2) 
    {
        if(start >= nums.length) 
        {
            return group1 == group2; // If all numbers have been considered, check if the sums of the two groups are equal
        }
        
        // Include the current number in the first group and recursively check the rest of the array
        if(split(start + 1, nums, group1 + nums[start], group2)) 
        {
            return true;
        }
        
        // Include the current number in the second group and recursively check the rest of the array
        if(split(start + 1, nums, group1, group2 + nums[start])) 
        {
            return true;
        }
        
        return false;
    }
    public static void main(String[] args) 
    {
        System.out.println(splitArray(new int[]{2, 2}));
        System.out.println(splitArray(new int[]{2, 3}));
        System.out.println(splitArray(new int[]{5, 2, 3}));
    }    
}
