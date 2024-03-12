
// Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.


// square56([3, 1, 4]) → [19, 11]
// square56([1]) → [11]
// square56([2]) → [14]

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Square56 
{
    public static List<Integer> square56(List<Integer> nums) 
    {
        nums.replaceAll(n -> (n*n)+10);
        nums.removeIf(n -> n%10 == 5 || n%10 == 6);
        return nums;
    }

    public static void main(String[] args) 
    {
        System.out.println(square56(new ArrayList<>(Arrays.asList(3, 1, 4))));
        System.out.println(square56(new ArrayList<>(Arrays.asList(1))));
        System.out.println(square56(new ArrayList<>(Arrays.asList(2))));
    }    
}
