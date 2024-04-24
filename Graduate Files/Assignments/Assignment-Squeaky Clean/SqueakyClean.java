public class SqueakyClean 
{
    static String clean(String identifier) 
    {
        StringBuilder result = new StringBuilder();
        boolean upper = false;
        for(int i=0; i<identifier.length(); i++)
        {
            char c = identifier.charAt(i);
            if(c == '4')
            {
                result.append('a');
            }
            else if(c == '3')
            {
                result.append('e');
            }
            else if(c == '0')
            {
                result.append('o');
            }
            else if(c == '7')
            {
                result.append('t');
            }
            else if(c == '1')
            {
                result.append('l');
            }
            else if(Character.isSpaceChar(c))
            {
                result.append('_');
            }
            else if(Character.isISOControl(c))
            {
                result.append("CTRL");
            }
            else if(c == '-')
            {
                upper = true;
            }
            else if(c >= 'α' && c <= 'ω')
            {
                
            }
            else if(upper)
            {
                result.append(Character.toUpperCase(c));
                upper = false;
            }
            else if(Character.isLetter(c) || c == '-')
            {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) 
    {
        System.out.println(clean("my   Id"));    
        System.out.println(clean("a-bc"));
        System.out.println(clean("H3ll0 W0rld"));
        System.out.println(clean("a$#.b"));
    }
}