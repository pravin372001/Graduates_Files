// Given a non-empty string like "Code" return a string like "CCoCodCode".


// stringSplosion("Code") → "CCoCodCode"
// stringSplosion("abc") → "aababc"
// stringSplosion("ab") → "aab"



public class StringSplosion 
{
    public static String stringSplosion(String str) 
    {
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<str.length(); i++)
        {
            ans.append(str.substring(0, i+1));
        }
        return ans.toString();
    }

    public static void main(String[] args) 
    {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));    
    }    
}
