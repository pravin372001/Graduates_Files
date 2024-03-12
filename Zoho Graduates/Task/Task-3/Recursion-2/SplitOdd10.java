
// Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10, and the sum of the other group is odd. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)


// splitOdd10([5, 5, 5]) → true
// splitOdd10([5, 5, 6]) → false
// splitOdd10([5, 5, 6, 1]) → true

public class SplitOdd10 
{
    public static boolean splitOdd10(int[] nums) 
    {
        return splitOdd10Helper(0, nums, 0, 0);
    }

    public static boolean splitOdd10Helper(int start, int[] nums, int group1Sum, int group2Sum) 
    {
        if(start >= nums.length) 
        {
            return (group1Sum % 10 == 0 && group2Sum % 2 == 1) || (group2Sum % 10 == 0 && group1Sum % 2 == 1);
        }

        int num = nums[start];
        return splitOdd10Helper(start + 1, nums, group1Sum + num, group2Sum) || splitOdd10Helper(start + 1, nums, group1Sum, group2Sum + num);
    }
    public static void main(String[] args) 
    {
        System.out.println(splitOdd10(new int[]{5, 5, 5}));
        System.out.println(splitOdd10(new int[]{5, 5, 6}));
        System.out.println(splitOdd10(new int[]{5, 5, 6, 1}));
    }    
}
