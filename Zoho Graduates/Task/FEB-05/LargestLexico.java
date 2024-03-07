import java.util.Arrays;
import java.util.Scanner;


public class LargestLexico 
{
    public static String[] lexico(String [] s)
    {
        for(int i = 0; i < s.length; i++)
        {
            char[] c = s[i].toCharArray();
            Arrays.sort(c);
            s[i] = new StringBuilder(new String(c)).reverse().toString();
        }
        return s;
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter the number of strings to enter: ");
        int n = in.nextInt();
        String s[] = new String[n];
        for(int i = 0; i < n; i++)
        {
            s[i] = in.next();
        }   
        s = lexico(s);
        for(int i = 0; i < s.length; i++)
        {
            System.out.println("String "+(i+1)+" :"+s[i]);
        }
        in.close();
    }    
}
