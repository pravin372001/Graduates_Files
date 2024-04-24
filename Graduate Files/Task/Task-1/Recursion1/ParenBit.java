// Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".


// parenBit("xyz(abc)123") → "(abc)"
// parenBit("x(hello)") → "(hello)"
// parenBit("(xy)1") → "(xy)"


public class ParenBit 
{
    public static String parenBit(String str) 
    {
        if(str.isEmpty())
        {
            return str;
        }
        if(str.charAt(0) == '(')
        {
            int index = str.indexOf(")");
            return str.substring(0, index+1);
        }
        return parenBit(str.substring(1));
    }

    public static void main(String[] args) 
    {
        System.out.println(parenBit("xyz(abc)123"));
        System.out.println(parenBit("x(hello)"));
        System.out.println(parenBit("(xy)1"));      
    }    
}
