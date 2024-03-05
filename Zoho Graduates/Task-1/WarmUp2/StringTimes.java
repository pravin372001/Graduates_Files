
// Given a string and a non-negative int n, return a larger string that is n copies of the original string.


// stringTimes("Hi", 2) → "HiHi"
// stringTimes("Hi", 3) → "HiHiHi"
// stringTimes("Hi", 1) → "Hi"

public class StringTimes 
{
    public static String stringTimes(String str, int n) 
    {
        StringBuilder ans = new StringBuilder();
        while(n-- > 0)
        {
            ans.append(str);
        }
        return ans.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1) );
    }
}
