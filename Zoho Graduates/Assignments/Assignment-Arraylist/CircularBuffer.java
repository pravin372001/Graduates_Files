import java.util.ArrayList;

public class CircularBuffer {
    private ArrayList<String> buffer;
    private int size;
    private int curSize = 0;

    public CircularBuffer(int size) {
        this.size = size;
        this.buffer = new ArrayList<>(size);
    }

    // Method to add a message to the buffer
    public void addMessage(String message) {
        if (curSize < size) {
            buffer.add(curSize, message);
        } else {
            int newSize = curSize % size;
            buffer.set(newSize, message);
        }
        curSize++;
    }

    // Method to display all messages in the buffer
    public void displayMessages() {
        for (int i = 0; i < buffer.size(); i++) {
            System.out.println(buffer.get(i));
        }
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(5);

        // Add messages to the buffer
        buffer.addMessage("Message 1");
        buffer.addMessage("Message 2");
        buffer.addMessage("Message 3");
        buffer.addMessage("Message 4");
        buffer.addMessage("Message 5");
        buffer.addMessage("Message 6"); 
        buffer.addMessage("Message 7"); 
        buffer.addMessage("Message 8"); 

        // Display all messages in the buffer
        buffer.displayMessages();
    }
}
