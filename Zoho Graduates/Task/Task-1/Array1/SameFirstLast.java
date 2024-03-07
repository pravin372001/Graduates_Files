// Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.


// sameFirstLast([1, 2, 3]) → false
// sameFirstLast([1, 2, 3, 1]) → true
// sameFirstLast([1, 2, 1]) → true



public class SameFirstLast 
{
    public static boolean sameFirstLast(int[] nums) 
    {
        return nums.length > 0 && nums[0] == nums[nums.length-1];
    }

    public static void main(String[] args) 
    {
        System.out.println(sameFirstLast(new int[]{1, 2, 3}));    
    }    
}
