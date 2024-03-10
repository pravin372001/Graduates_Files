import java.util.Scanner;

public class CelsiusToFahren 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double temperature = in.nextDouble();
        double fahren = ((temperature * 9) / 5) + 32;
        System.out.println("Fahrenheit: "+fahren);
        in.close();
    }
}