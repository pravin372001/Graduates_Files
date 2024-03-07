// Write a program that calculates the average weight of 10 people. Use descriptive and meaningful variable names following Java naming conventions. Use proper datatypes for the variables.

import java.util.Scanner;

public class AverageWeight 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int[] weights = new int[10];
        int sumOfWeights = 0;
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Enter the weight of person "+(i+1)+" : ");
            weights[i] = in.nextInt();
            sumOfWeights += weights[i];
        }    
        System.out.println("Average Weight of 10 persons is "+sumOfWeights / 10);
        in.close();
    }
}
