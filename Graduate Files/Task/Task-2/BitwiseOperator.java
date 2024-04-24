// Write a program to define the functionality of a Bitwise operators

public class BitwiseOperator 
{

    public static void main(String[] args) {

        // Declare two integer variables
        int a = 10;
        int b = 6;

        // Perform bitwise AND operation
        int andResult = a & b;
        System.out.println("Bitwise AND operation result: " + andResult);

        // Perform bitwise OR operation
        int orResult = a | b;
        System.out.println("Bitwise OR operation result: " + orResult);

        // Perform bitwise XOR operation
        int xorResult = a ^ b;
        System.out.println("Bitwise XOR operation result: " + xorResult);

        // Perform bitwise complement operation
        int complementResult = ~a;
        System.out.println("Bitwise complement operation result: " + complementResult);

        // Perform left shift operation
        int leftShiftResult = a << 2;
        System.out.println("Left shift operation result: " + leftShiftResult);

        // Perform right shift operation
        int rightShiftResult = a >> 2;
        System.out.println("Right shift operation result: " + rightShiftResult);
    }
}