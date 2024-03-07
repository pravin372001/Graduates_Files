public class AlternateSorting
{
    public static void main(String[] args) 
    {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arr = alternateSort(arr);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] alternateSort(int[] arr)
    {
        int min = 0;
        int max = arr.length - 1;
        int arr1[] = new int[arr.length];
        int i = 0;
        while(min <= max)
        {
            if(i % 2 == 0)
            {
                arr1[i] = arr[max--];
            }
            else
            {
                arr1[i] = arr[min++];
            }
            i++;
        }
        return arr1;
    }
}