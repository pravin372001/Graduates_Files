
// We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.


// xyBalance("aaxbby") → true
// xyBalance("aaxbb") → false
// xyBalance("yaaxbb") → false


public class XyBalance 
{
    public static boolean xyBalance(String str) 
    {
        int lastIndexX = str.lastIndexOf('x');
        int lastIndexY = str.lastIndexOf('y');
        return lastIndexY >= lastIndexX;
    }

    public static void main(String[] args) 
    {
        System.out.println(xyBalance("aaxbby"));    
    }    
}
