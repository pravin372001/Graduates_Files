// We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.


// makeChocolate(4, 1, 9) → 4
// makeChocolate(4, 1, 10) → -1
// makeChocolate(4, 1, 7) → 2

public class MakeChocolate 
{
    public static int makeChocolate(int small, int big, int goal) 
    {
        int maxBig = goal / 5;
        if(big >= maxBig) 
        {
            int remainingSmall = goal - (maxBig * 5);
            if(small >= remainingSmall) 
            {
                return remainingSmall;
            }
        } 
        else 
        {
            int remainingGoal = goal - (big * 5);
            if(small >= remainingGoal) 
            {
                return remainingGoal;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        System.out.println(makeChocolate(4, 1, 9));    
    }    
}
