import java.io.*;

public class ReadFromConsoleToFile {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("dest.txt");
        int value = System.in.read();
        while(value != -1){
            fos.write(value);
            value = System.in.read();
        }
        System.out.println("Content copied successfully");
        System.in.close();
    }
}
