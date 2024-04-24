import java.util.Scanner;

public class JumbledNumbers     
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        String s = Integer.toString(n);
        boolean flag = true;
        for(int i=0; i<s.length()-1; i++)
        {
            int a = s.charAt(i) - '0';
            int b = s.charAt(i+1) - '0';
            if(a+1 != b && b+1 != a)
            {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "Jumbled"+" "+flag : "Not Jumbled"+" "+flag);
        in.close();
    }
}
