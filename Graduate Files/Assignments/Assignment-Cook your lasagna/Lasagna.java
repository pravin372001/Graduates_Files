public class Lasagna {
    static final int LASAGNA_COOKING = 40; 
    public int expectedMinutesInOven()
    {
        return LASAGNA_COOKING;
    }

    public int remainingMinutesInOven(int lasagnaInOvenInMinutes)
    {
        return expectedMinutesInOven()-lasagnaInOvenInMinutes;
    }

    public int preparationTimeInMinutes(int numberOfLayers)
    {
        return numberOfLayers*2;
    }

    public int totalTimeInMinutes(int numberOfLayers, int lasagnaInOvenInMinutes)
    {
        return preparationTimeInMinutes(numberOfLayers)+lasagnaInOvenInMinutes;
    }

    public static void main(String[] args) 
    {
        Lasagna lasagna = new Lasagna();
        System.out.println(lasagna.expectedMinutesInOven());
        System.out.println(lasagna.remainingMinutesInOven(30));
        System.out.println(lasagna.preparationTimeInMinutes(3));
        System.out.println(lasagna.totalTimeInMinutes(3, 30));    
    }
    
}