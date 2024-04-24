public class ExpressionEvaluation1 
{
    public static void main(String[] args) 
    {
        int a = 28;
        a += a++ + ++a + --a + a--;
        System.out.println("Result: " + a); // Output: 144
    }
}
