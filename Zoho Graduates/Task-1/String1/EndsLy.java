
// Given a string, return true if it ends in "ly".


// endsLy("oddly") → true
// endsLy("y") → false
// endsLy("oddy") → false

public class EndsLy 
{
    public static boolean endsLy(String str) 
    {
        if(str.length() < 2)
        {
            return false;
        }
        String last = str.substring(str.length()-2);
        return last.equals("ly");
    }

    public static void main(String[] args) 
    {
        System.out.println(endsLy("oddly"));
    }    
}
