import java.util.Scanner;

public class CaptializeFirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = in.nextLine();
        in.close();
        System.out.println(capitalizeFirst(str));
    }

    private static String capitalizeFirst(String str) {
        if (str.length() == 0) {
            return str;
        }
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                str = str.substring(0, 1).toUpperCase() + str.substring(1);
            } else if (str.charAt(i) == ' ') {
                str = str.substring(0, i + 1) + str.substring(i + 1, i + 2).toUpperCase() + str.substring(i + 2);
            }
        }
        return str;
    }
}
