import java.util.Scanner;

public class QuadraticEquation
{
	public static void main(String args[])
    {
		//Initailize
		double a, b, c;	
		double FirstRoot, SecondRoot;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input Number of a: ");
		a = in.nextDouble();
		System.out.print("Input Number of b: ");
		b = in.nextDouble();
		System.out.print("Input Number of c: ");
		c = in.nextDouble();
		
		//Determinant b^2-4ac
		double Determinant = b*b - 4*a*c;

		if(Determinant>0)
		{
			FirstRoot = (-b+Math.sqrt(Determinant))/2*a;
			SecondRoot = (-b-Math.sqrt(Determinant))/2*a;

			System.out.println("The Roots Are "+FirstRoot+" and "+SecondRoot);
		}
		else if(Determinant == 0)
		{	
			//Roots are equal
			FirstRoot = SecondRoot = -b/2*a;
			System.out.println("The Roots Are "+FirstRoot+" and "+SecondRoot);
		
		}
		else
		{	
			// Roots are Complex
			double real = -b/2*a;
			double Imaginary = Math.sqrt(-Determinant)/2*a;

			System.out.printf("The First Roots = %.2f+%.2f%n ",real, Imaginary);
			System.out.printf("The Second Roots = %.2f-%.2f%n ",real, Imaginary);
		}
		in.close();
	}
}
