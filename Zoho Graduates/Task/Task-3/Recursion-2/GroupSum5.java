
// Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with these additional constraints: all multiples of 5 in the array must be included in the group. If the value immediately following a multiple of 5 is 1, it must not be chosen. (No loops needed.)


// groupSum5(0, [2, 5, 10, 4], 19) → true
// groupSum5(0, [2, 5, 10, 4], 17) → true
// groupSum5(0, [2, 5, 10, 4], 12) → false


public class GroupSum5 
{
    public static boolean groupSum5(int start, int[] nums, int target) 
    {
        if(nums.length <= start)
        {
            return target == 0;
        }
        
        if(nums[start]%5 == 0)
        {
            if(start < nums.length - 1 && nums[start + 1] == 1)
            {
            return groupSum5(start + 2, nums, target - nums[start]);
            }
            return groupSum5(start + 1, nums, target - nums[start]);
        }
        
        if(groupSum5(start + 1, nums, target - nums[start]))
        {
            return true;
        }
        
        if(groupSum5(start + 1, nums, target))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) 
    {
        System.out.println(groupSum5(0, new int[]{2, 5, 10, 4}, 19));
        System.out.println(groupSum5(0, new int[]{2, 5, 10, 4}, 17));
        System.out.println(groupSum5(0, new int[]{2, 5, 10, 4}, 12));
    }    
}
