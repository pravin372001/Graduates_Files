public class UserDefineException extends Exception {
    public UserDefineException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            throw new UserDefineException("UserDefineException is thrown");
        } catch (UserDefineException e) {
            System.out.println("User define exception: " + e.getMessage());
        }
    }
}
