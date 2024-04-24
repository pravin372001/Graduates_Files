import java.util.Scanner;

public class PatternAlphabet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        char input = in.next().charAt(0);

        int index = input - 'A' + 1;
        char temp = 'A';

        for (int i = 0; i < index; i++) {
            for (int j = i; j < index - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i) {
                    System.out.print(temp + " ");
                } else {
                    System.out.print("  ");
                }
            }
            temp++;
            System.out.println();
        }

        temp -= 2;
        for (int i = index - 1; i > 0; i--) {
            for (int j = index - 1; j > i - 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                if (k == 0 || k == i - 1) {
                    System.out.print(temp + " ");
                } else {
                    System.out.print("  ");
                }
            }
            temp--;
            System.out.println();
        }
        in.close();

    }
}
