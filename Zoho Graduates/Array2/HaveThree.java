
// Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.


// haveThree([3, 1, 3, 1, 3]) → true
// haveThree([3, 1, 3, 3]) → false
// haveThree([3, 4, 3, 3, 4]) → false


public class HaveThree 
{
    public static boolean haveThree(int[] nums) 
    {
        int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(i<nums.length-1 && nums[i] == 3 && nums[i+1] == 3)
            {
            return false;
            }
            if(nums[i] == 3)
            {
            count++;
            }
        }
        return count == 3;
    }

    public static void main(String[] args) 
    {
        System.out.println(haveThree(new int[]{3, 1, 3, 1, 3}));    
    }    
}
