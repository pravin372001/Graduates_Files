// Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.


// arrayFront9([1, 2, 9, 3, 4]) → true
// arrayFront9([1, 2, 3, 4, 9]) → false
// arrayFront9([1, 2, 3, 4, 5]) → false



public class ArrayFront9 
{
    public static boolean arrayFront9(int[] nums) 
    {
        int count = 0;
        for(int num : nums)
        {
            count++;
            if(count < 4 && num == 9)
            {
            return true;
            }
        }
        return false;
    }

    public static void main(String[] args) 
    {
        System.out.println(arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 9}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 5}));
    }    
}
