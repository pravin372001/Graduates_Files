import java.util.Scanner;

public class WeekdayEnumDemo 
{
    enum Weekday 
    {
        SUNDAY  , MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number (1-7) to display the weekday: ");
        int dayNumber = in.nextInt();

        Weekday[] weekdays = Weekday.values();
        if(dayNumber >= 1 && dayNumber <= 7) 
        {
            Weekday chosenDay = weekdays[dayNumber - 1];
            System.out.println("The weekday is: " + chosenDay);
        } 
        else 
        {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        in.close();
    }
}
