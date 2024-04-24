import java.util.Scanner;

public class BitwiseOperations 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        // Bitwise AND
        int bitwiseAnd = num1 & num2;
        System.out.println("Bitwise AND: " + bitwiseAnd);

        // Bitwise OR
        int bitwiseOr = num1 | num2;
        System.out.println("Bitwise OR: " + bitwiseOr);

        // Bitwise XOR
        int bitwiseXor = num1 ^ num2;
        System.out.println("Bitwise XOR: " + bitwiseXor);

        // Left shift
        int leftShiftNum1 = num1 << 1;
        int leftShiftNum2 = num2 << 1;
        System.out.println("Left shift of num1: " + leftShiftNum1);
        System.out.println("Left shift of num2: " + leftShiftNum2);

        // Right shift
        int rightShiftNum1 = num1 >> 1;
        int rightShiftNum2 = num2 >> 1;
        System.out.println("Right shift of num1: " + rightShiftNum1);
        System.out.println("Right shift of num2: " + rightShiftNum2);

        in.close();
    }
}
