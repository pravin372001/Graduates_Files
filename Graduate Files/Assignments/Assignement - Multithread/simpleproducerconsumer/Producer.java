import java.util.List;

public class Producer implements Runnable {
    private List<Integer> buffer;
    private int capacity;
    private int count = 0;

    public Producer(List<Integer> buffer, int capacity) {
        this.buffer = buffer;
        this.capacity = capacity;
    }

    @Override
    public void run() {
        while (true) {
            try {
                produce();
                Thread.yield();
				// Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void produce() throws InterruptedException {
        synchronized (buffer) {
            while (buffer.size() == capacity) {
                System.out.println("Buffer is full. Producer is waiting..");
                buffer.wait();
            }

            int item = count++;
            buffer.add(item);
            System.out.println("Produced: " + item);
            buffer.notify();
        }
    }
}