// In the BMI calculator program done in Java Assignment 2, write methods to get height and weight for 2 or more persons and compare their BMIs.

import java.util.Scanner;

public class BMICalculator
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of persons : ");
        int noOfPerson = in.nextInt();
        System.out.println("Enter the weight and height of "+noOfPerson+" persons : ");
        BMI[] obj = new BMI[noOfPerson]; 
        for(int i = 0; i < noOfPerson; i++)
        {
            System.out.print("Enter the weight(Kgs) of person "+(i+1)+" : ");
            double weight = in.nextDouble();
            System.out.print("Enter the height(Meters) of person "+(i+1)+" : ");
            double height = in.nextDouble();
            BMI bmi = new BMI(weight, height);
            obj[i] = bmi;
        }
        double min = Integer.MAX_VALUE;
        for(int i = 0; i < noOfPerson; i++)
        {
            if(obj[i].bmi < min)
            {
                min = obj[i].bmi;
            }
        }
        System.out.printf("Minimum BMI is %.2f",min);
        in.close();  
    }    
}
class BMI
{
    double weight;
    double height;
    double bmi;
    public BMI(double weight, double height)
    {
        this.weight = weight;
        this.height = height;
        this.bmi =  weight / (height * height);
    }
}
