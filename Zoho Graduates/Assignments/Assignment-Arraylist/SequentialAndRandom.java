import java.util.ArrayList;

public class SequentialAndRandom {
    public static void main(String[] args) {
        int capcity = 50;
        ArrayList<Integer> arrayList = new ArrayList<>(capcity);

        for (int i = 0; i < capcity; i++) {
            arrayList.add(i);
        }

        int random = (int) (Math.random() * capcity);
        long startTime = System.nanoTime();
        arrayList.get(random); // Access a random element
        long randomAccessTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < capcity; i++) {
            if (i == random) {
                arrayList.get(i); // Access elements sequentially
                break;
            }
        }
        long sequentialAccessTime = System.nanoTime() - startTime;

        System.out.println("Random Access Time: " + randomAccessTime + " nanoseconds");
        System.out.println("Sequential Access Time: " + sequentialAccessTime + " nanoseconds");
    }
}
