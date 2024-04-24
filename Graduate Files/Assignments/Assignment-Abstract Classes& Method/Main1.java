import java.util.ArrayList;

public class Main1 {
    static ArrayList<String> a = new ArrayList<String>();

    public static void main(String[] args) {
        String s = "ABC";
        permute(s, 0, s.length() - 1);
        for (String i : a) {
            System.out.println(i);
        }

    }

    private static void permute(String s, int low, int high) {
        if (low == high) {
            a.add(s);
        } else {
            for (int i = low; i <= high; i++) {
                s = swap(s, low, i);
                permute(s, low + 1, high);
            }
        }
    }

    private static String swap(String s, int low, int high) {
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == low) {
                t += s.charAt(high);
            } else if (i == high) {
                t += s.charAt(low);
            } else {
                t += s.charAt(i);
            }
        }
        return t;
    }

}