
// Given an array of ints, return true if it contains no 1's or it contains no 4's.


// no14([1, 2, 3]) → true
// no14([1, 2, 3, 4]) → false
// no14([2, 3, 4]) → true


public class No14 
{
    public static boolean no14(int[] nums) 
    {
        boolean one = false;
        boolean four = false;
        for(int num : nums)
        {
            if(num == 1)
            {
            one = true;
            }
            if(num == 4)
            {
            four = true;
            }
        }
        return !one || !four;
    }

    public static void main(String[] args) 
    {
        System.out.println(no14(new int[]{1, 2, 3}));    
    }    
}
