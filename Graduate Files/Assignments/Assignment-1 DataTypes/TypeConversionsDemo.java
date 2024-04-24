public class TypeConversionsDemo 
{
    public static void main(String[] args) 
    {
        float floatNum = 10.5f;
        int intNum;
        double doubleNum = 20.75;

        // float to int conversion
        intNum = (int) floatNum;
        System.out.println("Float to Int: " + intNum);

        // double to float conversion
        float floatNum2 = (float) doubleNum;
        System.out.println("Double to Float: " + floatNum2);

        // int to short conversion
        int intNum2 = 1500;
        short shortNum = (short) intNum2;
        System.out.println("Int to Short: " + shortNum);
    }
}
