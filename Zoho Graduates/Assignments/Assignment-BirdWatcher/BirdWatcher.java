import java.util.Arrays;

public class BirdWatcher
{
    int[] birdsPerDay;
    public BirdWatcher(int[] birdsPerDay)
    {
        this.birdsPerDay = birdsPerDay;
    }
    public static void main(String[] args) 
    {
        int [] arr = new int[]{2, 5, 0, 7, 4, 1};
        BirdWatcher birdWatcher = new BirdWatcher(arr);
        System.out.println("Last week:"+Arrays.toString(birdWatcher.getLastWeek()));
        System.out.println("Today Visited:"+birdWatcher.getToday());
        System.out.println("After increment :"+birdWatcher.incrementTodaysCount());
        System.out.println("Days without birds visit:"+birdWatcher.hasDayWithoutBirds());
        System.out.println(""+birdWatcher.getCountForFirstDays(2));
        System.out.println(birdWatcher.getBusyDays());

    }
    private int[] getLastWeek()
    {
        return birdsPerDay;
    }

    private int getToday()
    {
        return birdsPerDay.length - 1 == 0 ? 0 : birdsPerDay[birdsPerDay.length - 1];
    }

    private int incrementTodaysCount()
    {
        birdsPerDay[birdsPerDay.length - 1]++;
        return birdsPerDay[birdsPerDay.length - 1];
    }

    private boolean hasDayWithoutBirds()
    {
        return Arrays.stream(birdsPerDay).anyMatch(x -> x == 0);
    }

    private int getCountForFirstDays(int days)
    {
        return Arrays.stream(birdsPerDay).limit(days).sum();
    }

    private int getBusyDays()
    {
        return (int)Arrays.stream(birdsPerDay).filter(x -> x >= 5).count();
    }
}