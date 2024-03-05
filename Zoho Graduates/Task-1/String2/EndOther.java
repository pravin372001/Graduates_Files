
// Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.


// endOther("Hiabc", "abc") → true
// endOther("AbC", "HiaBc") → true
// endOther("abc", "abXabc") → true


public class EndOther 
{
    public static boolean endOther(String a, String b) 
    {
        a = a.toLowerCase();
        b = b.toLowerCase();
        String min = "";
        String max = "";
        if(a.length() > b.length())
        {
            min = b;
            max = a;
        }
        else
        {
            min = a;
            max = b;
        }
        return max.substring(max.length()-min.length()).equals(min);
    }

    public static void main(String[] args) 
    {
        System.out.println(endOther("Hiabc", "abc"));    
    }    
}
