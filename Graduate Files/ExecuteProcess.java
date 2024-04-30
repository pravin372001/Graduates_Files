public class ExecuteProcess {
    public static void main(String[] args) throws Exception {
        String path = "dest.txt";
        Runtime rs = Runtime.getRuntime();
        String command = "atom " + path;
        Process process = rs.exec("notepad.exe");
    }    
}
