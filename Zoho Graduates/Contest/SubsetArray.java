public class SubsetArray {
    public static void main(String[] args) {
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 11, 7, 1 };
        boolean[] flag = new boolean[arr1.length];
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j] && !flag[j]) {
                    count++;
                    flag[j] = true;
                }
            }
        }
        if (count == arr2.length) {
            System.out.println("arr2[] is a subset of arr1[]");
        } else {
            System.out.println("arr2[] is not a subset of arr1[]");
        }

    }
}
