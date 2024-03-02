// Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.


// midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
// midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
// midThree([1, 2, 3]) → [1, 2, 3]

import java.util.Arrays;

public class MidThree 
{
    public static int[] midThree(int[] nums) 
    {
        int mid = nums.length/2;
        return new int []{nums[mid-1], nums[mid], nums[mid+1]};
    }

    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(midThree(new int[]{1, 2, 3, 4, 5})));    
    }    
}
