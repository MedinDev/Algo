package School;

class Queue {
    private int[] elements;
    private int size;
    private int capacity;

    // Default constructor with initial capacity of 8
    public Queue() {
        capacity = 8;
        elements = new int[capacity];
        size = 0;
    }

    // Adds an element to the queue
    public void enqueue(int v) {
        if (size == capacity) {
            // Double the capacity when the array is full
            int[] newElements = new int[capacity * 2];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
            capacity *= 2;
        }
        elements[size++] = v;
    }

    // Removes and returns the element from the front of the queue
    public int dequeue() {
        if (empty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        int result = elements[0];
        // Shift all elements one position to the left
        for (int i = 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        size--;
        return result;
    }

    // Returns true if the queue is empty
    public boolean empty() {
        return size == 0;
    }

    // Returns the size of the queue
    public int getSize() {
        return size;
    }
}

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Enqueue numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

        // Dequeue and print all elements
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
