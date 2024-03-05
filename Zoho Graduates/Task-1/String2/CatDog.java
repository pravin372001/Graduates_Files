
// Return true if the string "cat" and "dog" appear the same number of times in the given string.


// catDog("catdog") → true
// catDog("catcat") → false
// catDog("1cat1cadodog") → true


public class CatDog 
{
    public static boolean catDog(String str) 
    {
        int countCat = 0;
        int countDog = 0;
        for(int i=0; i<str.length()-2; i++)
        {
            if(str.substring(i, i+3).equals("cat"))
            {
            countCat++;
            }
            else if(str.substring(i, i+3).equals("dog"))
            {
            countDog++;
            }
        }
        return countCat == countDog;
    }
    public static void main(String[] args) 
    {
        System.out.println(catDog("catdog"));    
    }    
}
