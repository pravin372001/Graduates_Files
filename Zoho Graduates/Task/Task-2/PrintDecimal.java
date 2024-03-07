// Write a program to print the number 7.50 without using String(print 7.50 not 7.5).


public class PrintDecimal 
{
    public static void main(String[] args) 
    {
        double number = 7.50;
        System.out.printf("%.2f", number);
    }
}
