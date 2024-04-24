
// Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.


// closeFar(1, 2, 10) → true
// closeFar(1, 2, 3) → false
// closeFar(4, 1, 3) → true


public class CloseFar 
{
    public static boolean closeFar(int a, int b, int c) 
    {
        int diffAB = Math.abs(a - b);
        int diffAC = Math.abs(a - c);
        int diffBC = Math.abs(b - c);
        
        if((diffAB <= 1 && diffAC >= 2 && diffBC >= 2) || (diffAC <= 1 && diffAB >= 2 && diffBC >= 2)) 
        {
            return true;
        } 
        else if ((diffAB <= 1 && diffBC >= 2 && diffAC >= 2) || (diffBC <= 1 && diffAB >= 2 && diffAC >= 2)) 
        {
            return true;
        } 
        return false;
    }

    public static void main(String[] args) 
    {
        System.out.println(closeFar(1, 2, 10));    
    }    
}
