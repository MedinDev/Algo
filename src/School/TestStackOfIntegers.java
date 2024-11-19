package School;

import java.util.Scanner;

public class TestStackOfIntegers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers(32); // Adjust capacity if needed
        findFactors(number, stack);

        // Display factors
        System.out.println("The factors for " + number + " are: ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    // Implement the findFactors method
    public static void findFactors(int number, StackOfIntegers stack) {
        int factor = 2;
        while (number > 1) {
            while (number % factor == 0) {
                stack.push(factor);
                number /= factor;
            }
            factor++;
        }
    }
}

class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int CAPACITY = 16;

    // Default constructor
    StackOfIntegers() {
        this(CAPACITY);
    }

    // Constructor with a specified capacity
    StackOfIntegers(int newCapacity) {
        elements = new int[newCapacity];
    }

    public int getSize() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public int peek() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[size - 1];
    }

    // Implement the push method
    public void push(int data) {
        if (size >= elements.length) {
            // Resize the stack dynamically if needed
            int[] newElements = new int[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = data;
    }

    // Implement the pop method
    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[--size];
    }
}
