import java.util.ArrayList;
import java.util.List;

public class MergeArray 
{
    public static void main(String[] args) 
    {
        int[] arr1 = new int[]{2,4,5,6,7,9,10,13};
        int[] arr2 = new int[]{2,3,4,5,6,7,8,9,11,15};
        List<Integer> list = mergeArray(arr1, arr2);
        System.out.println(list);
    }    

    public static List<Integer> mergeArray(int[] arr1, int[] arr2)
    {
        List<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                list.add(arr1[i]);
                i++;
            }
            else if(arr1[i] > arr2[j])
            {
                list.add(arr2[j]);
                j++;
            }
            else
            {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        while(i < arr1.length)
        {
            list.add(arr1[i]);
            i++;
        }
        while(j < arr2.length)
        {
            list.add(arr2[j]);
            j++;
        }
        return list;
    }
}
