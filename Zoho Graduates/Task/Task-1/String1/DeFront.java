
// Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.


// deFront("Hello") → "llo"
// deFront("java") → "va"
// deFront("away") → "aay"



public class DeFront 
{
    public static String deFront(String str) 
    {    
        if(str.startsWith("ab")) 
        {
            return str;
        } 
        else if (str.startsWith("a")) 
        {
            return "a" + str.substring(2);
        } 
        else if (str.charAt(1) == 'b') 
        {
            return str.substring(1);
        }
        return str.substring(2);
    }
    public static void main(String[] args) 
    {
        System.out.println(deFront("Hello"));    
    }    
}
