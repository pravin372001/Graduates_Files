// Write a program to validate email address
//  (contains @ and proper domain format). Note: Don't use regular expressions

import java.util.Scanner;

public class ValidateEmail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String email = in.next();
        ValidateEmail obj = new ValidateEmail();
        System.out.println(obj.validateEmail(email));
        in.close();
    }

    public boolean validateEmail(String email) {
        if (email.contains("@") && !email.contains(" ")) {
            int index = email.indexOf("@");
            String name = email.substring(0, index);
            if ((name.length() < 20 && name.length() > 5)) {
                return false;
            }
            if (index > 0) {
                String domain = email.substring(index + 1);
                if ((domain.contains(".com") || domain.contains(".in")) && !domain.contains("..")) {
                    return true;
                }
            }
        }
        return false;
    }
}
