
// Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.


// canBalance([1, 1, 1, 2, 1]) → true
// canBalance([2, 1, 1, 2, 1]) → false
// canBalance([10, 10]) → true

public class CanBalance 
{
    public static boolean canBalance(int[] nums) 
    {
        int leftSum = 0;
        int rightSum = 0;
        
        for(int i = 0; i < nums.length; i++) 
        {
            rightSum += nums[i];
        }

        for(int i = 0; i < nums.length; i++) 
        {
            leftSum += nums[i];
            rightSum -= nums[i];

            if(leftSum == rightSum) 
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) 
    {
        System.out.println(canBalance(new int[] {1, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[] {2, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[] {10, 10}));    
    }    
}
