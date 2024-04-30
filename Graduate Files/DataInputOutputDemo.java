import java.io.*;

public class DataInputOutputDemo {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(System.in);
        
        FileOutputStream fos = new FileOutputStream("out.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        int a = 5;
        int sum = 0;    
        while (a-- > 0) {
            System.out.print("Enter an integer: ");
            int val = dis.readInt();
            System.out.println(val);
            sum += val;
        }
        dos.writeInt(sum);
        System.out.println("Sum: " + sum);

        // Close the streams
        dos.close();
        fos.close();
        dis.close();
    }
}
