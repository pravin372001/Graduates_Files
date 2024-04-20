import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        ReverseWord obj = new ReverseWord();
        System.out.println(obj.reverseWord(str));
        in.close();
    }

    public String reverseWord(String str) {
        int index = str.indexOf(" ");
        if (str.length() == 0 || index == -1) {
            return str;
        }
        return  reverseWord(str.substring(index + 1)) +" "+ str.substring(0, index);
    }

}
