import java.util.List;

public class Consumer implements Runnable {
	private List<Integer> buffer;

	public Consumer(List<Integer> buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		while (true) {
			try {
				consume();
				Thread.yield();
				// Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void consume() throws InterruptedException {
		synchronized (buffer) {
			while (buffer.isEmpty()) {
				System.out.println("Buffer is empty. Consumer is waiting..");
				buffer.wait();
			}

			int item = buffer.remove(0);
			System.out.println("Consumed: " + item);
			buffer.notifyAll();
		}
	}
}