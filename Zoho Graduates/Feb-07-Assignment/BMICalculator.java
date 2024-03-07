// In the BMI calculator program done in Java Assignment 2, write methods to get height and weight for 2 or more persons and compare their BMIs.

import java.util.ArrayList;
import java.util.Scanner;

public class BMICalculator
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of persons : ");
        int noOfPerson = in.nextInt();
        System.out.println("Enter the weight and height of "+noOfPerson+" persons : ");
        ArrayList<BMI> bmis = new ArrayList<>(); 
        for(int i = 0; i < noOfPerson; i++)
        {
            System.out.print("Enter the name of person "+(i+1)+" : ");
            String name = in.next();
            System.out.print("Enter the weight(Kgs) of person "+(i+1)+" : ");
            double weight = in.nextDouble();
            System.out.print("Enter the height(Meters) of person "+(i+1)+" : ");
            double height = in.nextDouble();
            BMI bmi = new BMI(name, weight, height);
            bmis.add(bmi);
        }
        double min = Integer.MAX_VALUE;
        System.out.println("Name       |BMI       |Remark");
        for(int i = 0; i < noOfPerson; i++)
        {
            BMI bmi = bmis.get(i);
            String remark = bmi.bmi < 18.5 ? "Underweight" : (bmi.bmi < 25 ? "Normal" : (bmi.bmi < 30 ? "Overweight" : "Obese"));
            System.out.printf( "%-10s|%-10.2f|%-10s\n",bmi.name, bmi.bmi, remark);        
        }
        in.close();  
    }    
}
class BMI implements Comparable<BMI>
{
    String name;
    double weight;
    double height;
    double bmi;
    public BMI(String name, double weight, double height)
    {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.bmi =  weight / (height * height);
    }

    @Override
    public int compareTo(BMI o)
    {
        return (int) (this.bmi - o.bmi);
    }
}
