import java.util.Scanner;

public class MultiplicationTable 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to print its multiplication table: ");
        int number = in.nextInt();

        System.out.println("Multiplication table for " + number + ":");

        for(int i = 1; i <= 10; i++) 
        {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        in.close();
    }
}
