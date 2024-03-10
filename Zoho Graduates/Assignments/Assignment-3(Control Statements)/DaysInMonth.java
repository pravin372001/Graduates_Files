import java.util.Scanner;

public class DaysInMonth 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = in.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = in.nextInt();

        int daysInMonth;

        if(month == 4 || month == 6 || month == 9 || month == 11) 
        {
            daysInMonth = 30;
        } 
        else if(month == 2) 
        {
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
            {
                daysInMonth = 29;
            } 
            else 
            {
                daysInMonth = 28;
            }
        } 
        else 
        {
            daysInMonth = 31;
        }

        System.out.println("Number of days in the given month and year: " + daysInMonth);

        in.close();
    }
}
