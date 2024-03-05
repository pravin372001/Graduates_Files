
// Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number. Note that a length-0 array is valid. (See also: FizzBuzz Code)


// fizzArray3(5, 10) → [5, 6, 7, 8, 9]
// fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
// fizzArray3(1, 3) → [1, 2]

import java.util.Arrays;

public class FizzArray3 
{
    public static int[] fizzArray3(int start, int end) 
    {
        int [] arr = new int[end - start];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = start;
            start++;
        }
        return arr;
    }

    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(fizzArray3(5, 10)));    
    }    
}
