public class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if(operation == null){
              throw new IllegalArgumentException("Operation cannot be null");
        }
        if(operation.length() == 0){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        switch (operation){
            case "+":
                return ""+ operand1 +" "+ operation +" "+ operand2 +" = "+ (operand1+operand2);
            case "*":
                return ""+ operand1 +" "+ operation +" "+ operand2 +" = "+ (operand1*operand2);
            case "/":
                try {
                    return ""+ operand1 +" "+ operation +" "+ operand2 +" = "+ (operand1/operand2);
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException ("Division by zero is not allowed",e);
                }
            default:
                throw new IllegalOperationException("Operation '"+ operation +"' does not exist");
        }
    }
}