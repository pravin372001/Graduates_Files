
// Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.


// countCode("aaacodebbb") → 1
// countCode("codexxcode") → 2
// countCode("cozexxcope") → 2


public class CountCode 
{
    public static int countCode(String str) 
    {
        int count = 0;
        for(int i=0; i<str.length()-3;i++)
        {
            if(str.substring(i, i+4).equals("code") || (str.substring(i, i+2).equals("co") && str.substring(i+3, i+4).equals("e")))
            {
            count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        System.out.println(countCode("aaacodebbb"));    
    }    
}
