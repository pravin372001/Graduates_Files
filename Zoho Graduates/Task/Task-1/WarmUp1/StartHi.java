// Given a string, return true if the string starts with "hi" and false otherwise.


// startHi("hi there") → true
// startHi("hi") → true
// startHi("hello hi") → false


public class StartHi 
{
    public static boolean startHi(String str) 
    {
        return str.startsWith("hi");
    }

    public static void main(String[] args) 
    {
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
    }    
}
