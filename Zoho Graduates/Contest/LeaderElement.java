public class LeaderElement {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int count;
        for(int i=0; i<arr.length; i++)
        {
            count = 0;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    count++;
                }
            }
            if(count==arr.length-i-1)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
