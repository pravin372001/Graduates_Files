import java.util.Scanner;

public class TimeConverter 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        int totalSeconds = in.nextInt();

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        String timeFormatted = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println("Time in HH:mm:ss format: " + timeFormatted);

        in.close();
    }
}
