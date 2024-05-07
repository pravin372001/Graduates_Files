import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<Integer> buffer = new ArrayList<>();
        int capacity = 10;

        Thread producer = new Thread(new Producer(buffer, capacity));
        Thread consumer = new Thread(new Consumer(buffer));

        producer.start();
        consumer.start();
    }
}
