// Write a program with an if statement. Declare one variable inside the if block and another one outside. Print both variables inside and outside the if block to understand variable scope. (Comment the compiler error in your program while submitting)

public class DelcareVariable 
{
    public static void main(String[] args) 
    {
        int b = 20;
        if(true)
        {
            int a = 10;
            System.out.println(a);
            System.out.println(b);
        }
        System.out.println(a);  //a cannot be resolved to a variable
        System.out.println(b);
    }    
}
