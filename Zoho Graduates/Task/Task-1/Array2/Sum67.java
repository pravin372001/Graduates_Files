
// Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.


// sum67([1, 2, 2]) → 5
// sum67([1, 2, 2, 6, 99, 99, 7]) → 5
// sum67([1, 1, 6, 7, 2]) → 4

public class Sum67 
{
    public static int sum67(int[] nums) 
    {
        boolean isSix = false;
        int sum = 0;
        for(int num : nums)
        {
            if(num == 6)
            {
            isSix = true;
            continue;
            }
            
            if(num == 7 && isSix)
            {
            isSix = false;
            continue;
            }
            
            if(!isSix)
            {
            sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        System.out.println(sum67(new int[]{1, 2, 2}));    
    }    
}
