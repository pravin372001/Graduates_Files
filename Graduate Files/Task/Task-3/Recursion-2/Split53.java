
// Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)


// split53([1, 1]) → true
// split53([1, 1, 1]) → false
// split53([2, 4, 2]) → true

public class Split53 
{
    public static boolean split53(int[] nums) 
    {
        return splitHelper(0, nums, 0, 0);
    }

    public static boolean splitHelper(int start, int[] nums, int group5Sum, int group3Sum) 
    {
        if(start >= nums.length) 
        {
            return group5Sum == group3Sum;
        }

        int currentNum = nums[start];

        if(currentNum % 5 == 0) 
        {
            return splitHelper(start + 1, nums, group5Sum + currentNum, group3Sum);
        } 
        else if(currentNum % 3 == 0) 
        {
            return splitHelper(start + 1, nums, group5Sum, group3Sum + currentNum);
        } 
        else 
        {
            return splitHelper(start + 1, nums, group5Sum + currentNum, group3Sum) || splitHelper(start + 1, nums, group5Sum, group3Sum + currentNum);
        }
    }

    public static void main(String[] args) 
    {
        System.out.println(split53(new int[]{1, 1}));
        System.out.println(split53(new int[]{1, 1, 1}));
        System.out.println(split53(new int[]{2, 4, 2}));
    }    
}
