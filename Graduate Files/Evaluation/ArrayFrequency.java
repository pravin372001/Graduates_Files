import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayFrequency {
    public static void main(String[] args) {
        Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        

        List<Map.Entry> entries = new LinkedList<>(frequency.entrySet());

        Collections.sort(entries, new Comparator<Map.Entry>() {
            public int compare(Map.Entry o1, Map.Entry o2){
                return  (int)o2.getValue() - (int)o1.getValue();
            }
        });
        int []out = new int[arr.length];
        int ind = 0;

        for(int i=0; i<entries.size(); i++){
            Map.Entry<Integer, Integer> entry = entries.get(i);
            for(int j=0; j<entry.getValue(); j++){
                out[ind++] = entry.getKey();
            }
        }
        System.out.println();
        System.out.print(Arrays.toString(out));
        in.close();
    }
}
