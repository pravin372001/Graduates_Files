import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class StringCombination {

    static List<String> ansList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String :");
        String input = scanner.next();
        recursiveHelper(input, "");
        Collections.sort(ansList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() > s2.length()) {
                    return 1;
                } else if (s1.length() < s2.length()) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(ansList);
        scanner.close();
    }

    private static void recursiveHelper(String input, String ans) {
        if (input.length() == 0) {
            if (ans.length() != 0) {
                ansList.add(ans);
            }
            return;
        }

        recursiveHelper(input.substring(1), ans + input.charAt(0));
        recursiveHelper(input.substring(1), ans);
    }
}
