public class ZeroDivision {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Zero division is not supported");
        }
    }
}
