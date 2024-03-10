// Write a program to print prime numbers between 1 to 30


public class PrimeNumbers 
{
    public static void main(String[] args)
    {
        boolean isPrime = true;
        System.out.println("Prime numbers between 1 to 30 are: ");  
        for (int i = 2; i <= 30; i++)
        {
            isPrime = true;
            for (int j = 2; j < i/2; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }

            }
            if(isPrime)
            {
                System.out.print(i+" ");
            }
        }
        
    }    
}
