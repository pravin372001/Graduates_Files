
// Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.


// countClumps([1, 2, 2, 3, 4, 4]) → 2
// countClumps([1, 1, 2, 1, 1]) → 2
// countClumps([1, 1, 1, 1, 1]) → 1

public class CountClumps 
{
    public static int countClumps(int[] nums) 
    {
        int count = 0;
        boolean isClump = false;
        
        for (int i = 0; i < nums.length - 1; i++) 
        {
            if (nums[i] == nums[i + 1]) 
            {
                isClump = true;
            } 
            else 
            {
                if(isClump) 
                {
                    count++;
                }
                isClump = false;
            }
        }
        
        if(isClump) 
        {
            count++;
        }
        
        return count;
    }

    public static void main(String[] args) 
    {
        System.out.println(countClumps(new int[] {1, 2, 2, 3, 4, 4}));
        System.out.println(countClumps(new int[] {1, 1, 2, 1, 1})); 
        System.out.println(countClumps(new int[] {1, 1, 1, 1, 1}));   
    }    

}
