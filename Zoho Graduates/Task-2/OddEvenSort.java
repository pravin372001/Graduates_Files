import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OddEvenSort 
{
    public static void main(String[] args) 
    {
        int [] array = new int[]{13, 2, 4, 15, 12, 10, 5};
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        int[] sortedArray = oddEvenSort(array, oddList, evenList);
        System.out.println(Arrays.toString(sortedArray));
    }    

    public static int[] oddEvenSort(int[] array, List<Integer> oddList, List<Integer> evenList)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(i % 2 == 0)
            {
                oddList.add(array[i]);
            }
            else
            {
                evenList.add(array[i]);
            }
        }
        Collections.sort(oddList, Collections.reverseOrder());
        Collections.sort(evenList);
        for(int i = 0; i < array.length; i++)
        {
            if(i % 2 == 0)
            {
                array[i] = oddList.remove(0);
            }
            else
            {
                array[i] = evenList.remove(0);
            }
        }
        return array;
    }
}
