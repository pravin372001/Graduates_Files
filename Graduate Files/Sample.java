import java.io.*;

public class Sample {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("dest.txt");
        FileOutputStream fos = new FileOutputStream("dest.txt");

        int val = fis.read();
        System.out.println("val: " + val);
        while(val !=-1){
            System.out.println("inside");
            fos.write(val);
            val = fis.read();
        }
    }
}
