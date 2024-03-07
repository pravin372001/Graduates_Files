
// Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


// altPairs("kitten") → "kien"
// altPairs("Chocolate") → "Chole"
// altPairs("CodingHorror") → "Congrr"


public class AltPairs 
{
    public static String altPairs(String str) 
    {
        String result = "";
        for(int i=0; i<str.length(); i+=4)
        {
            int index = i+2;
            if(index > str.length())
            {
            index = str.length();
            }
            result += str.substring(i, index);
        }
        return result;
    }

    public static void main(String[] args) 
    {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));    
    }    
}
