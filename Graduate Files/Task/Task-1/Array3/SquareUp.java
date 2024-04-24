
// Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).


// squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
// squareUp(2) → [0, 1, 2, 1]
// squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

import java.util.Arrays;

public class SquareUp 
{
    public static int[] squareUp(int n) 
    {
        int[] result = new int[n * n];
        int index = 0;
        for(int i = 1; i <= n; i++) 
        {
            for(int j = n; j > 0; j--) 
            {
                if(j > i) 
                {
                    result[index] = 0;
                } 
                else 
                {
                    result[index] = j;
                }
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(squareUp(3)));
        System.out.println(Arrays.toString(squareUp(2))); 
        System.out.println(Arrays.toString(squareUp(4)));   
    }    
}
