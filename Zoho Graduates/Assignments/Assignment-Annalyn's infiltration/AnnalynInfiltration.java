public class AnnalynInfiltration 
{
     public static void main(String[] args) 
     {
        System.out.println(canFastAttack(true));
        System.out.println(canSpy(false, false, false));
        System.out.println(canSignalPrisoner(true, true));
        System.out.println(canFreePrisoner(true, false, true, true));
     }

     private static boolean canFastAttack(boolean knightIsAwake)
     {
        return !knightIsAwake;
     }

     private static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake)
     {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
     }

     private static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake)
     {
         return (!archerIsAwake && prisonerIsAwake) ;
     }

     private static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake,  boolean prisonerIsAwake, boolean petDogIsPresent)
     {
         return (!knightIsAwake && !archerIsAwake && !petDogIsPresent && prisonerIsAwake) 
                  || (!archerIsAwake && petDogIsPresent);
     }
}
