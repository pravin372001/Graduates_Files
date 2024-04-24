public class ArrayExceptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }

}
