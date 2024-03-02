
// Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.


// fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
// fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
// fix34([3, 2, 2, 4]) → [3, 4, 2, 2]

import java.util.Arrays;

public class Fix34 
{
    public static int[] fix34(int[] nums) 
    {
        int i=0;
        int j=nums.length-1;
        
        while(i<nums.length && j>=0)
        {
            while(i < nums.length && nums[i] != 3)
            {
            i++;
            }
            while(j >= 0 && nums[j]!=4)
            {
            j--;
            }
            if(i+1 < nums.length && nums[i+1] != 4)
            {
            int temp = nums[j];
            nums[j] = nums[i+1];
            nums[i+1] = temp;
            }
            i++;
            j--;
        }
        return nums;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(fix34(new int[] {1, 3, 1, 4})));    
        System.out.println(Arrays.toString(fix34(new int[] {1, 3, 1, 4, 4, 3, 1})));
        System.out.println(Arrays.toString(fix34(new int[] {3, 2, 2, 4})));
    }    
}
