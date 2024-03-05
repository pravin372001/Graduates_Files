
// Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).


// equalIsNot("This is not") → false
// equalIsNot("This is notnot") → true
// equalIsNot("noisxxnotyynotxisi") → true


public class EqualIsNot 
{
    public static boolean equalIsNot(String str) 
    {
        int countIs = 0;
            int countNot = 0;

            for(int i = 0; i < str.length() - 1; i++) 
            {
                if(str.startsWith("is", i)) 
                {
                    countIs++;
                }
                if(str.startsWith("not", i)) 
                {
                    countNot++;
                }
            }
            return countIs == countNot;
    }

    public static void main(String[] args) 
    {
        System.out.println(equalIsNot("This is not"));    
    }    
}
