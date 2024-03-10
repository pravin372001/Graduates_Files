import java.util.Scanner;

public class BMICalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Calculate BMI using the formula: weight / (height * height)
        double bmi = weight / (height * height);

        System.out.printf("Your Body Mass Index (BMI) is: %.2f" , bmi);

        scanner.close();
    }
}
