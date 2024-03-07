public class ExpressionEvaluation 
{
    public static void main(String[] args) 
    {
        // Expression (i) ++a - b--
        int a1 = 5;
        int b1 = 3;
        int result1 = ++a1 - b1--;
        System.out.println("Result (i): " + result1); // Output: 4

        // Expression (ii) a % b++
        int a2 = 10;
        int b2 = 3;
        int result2 = a2 % b2++;
        System.out.println("Result (ii): " + result2); // Output: 1

        // Expression (iii) a *= b + 5
        int a3 = 3;
        int b3 = 2;
        a3 *= b3 + 5;
        System.out.println("Result (iii): " + a3); // Output: 21

        // Expression (iv) x = 69 >>> 2
        int x = 69 >>> 2;
        System.out.println("Result (iv): " + x); // Output: 17
    }
}
