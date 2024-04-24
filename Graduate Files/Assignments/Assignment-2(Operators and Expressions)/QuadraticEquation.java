import java.util.Scanner;

public class QuadraticEquation 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;
        double sqrt = Math.sqrt(discriminant);

        if(discriminant > 0) 
        {
            double root1 = (-b + sqrt) / (2 * a);
            double root2 = (-b - sqrt) / (2 * a);
            System.out.println("The roots of the quadratic equation are " + root1 + " and " + root2);
        } 
        else if (discriminant == 0) 
        {
            double root = -b / (2 * a);
            System.out.println("The root of the quadratic equation is " + root);
        } 
        else 
        {
            System.out.println("The quadratic equation has complex roots");
        }

        scanner.close();
    }
}

