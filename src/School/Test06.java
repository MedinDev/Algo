package School;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        String s;
        char[] c;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter one string: ");
        s = input.nextLine();
        c = s.toCharArray();
        MyStringBuilder s1 = new MyStringBuilder(c);

        System.out.print("Enter another string: ");
        s = input.nextLine();
        MyStringBuilder s2 = new MyStringBuilder(s);

        s1.append(5926);
        s2.append(new MyStringBuilder(" World"));

        System.out.println("\nThe content in s1: " + s1.toString());
        System.out.println("  There are " + s1.length() + " characters in s1.");
        System.out.println("  The last character in s1 is " + s1.charAt(s1.length() - 1) + ".");
        System.out.println("  The substring from the index of 1: " + s1.substring(1).toString());
        System.out.println("  The substring in the index range of (0,3]: " + s1.substring(0, 4).toString());
        System.out.println("The content in s1 now: " + s1.toString());

        System.out.println("\nThe content in s2: " + s2.toString());
        System.out.println("  The lowercase copy of s2: " + s2.toLowerCase().toString());
        System.out.println("The content in s2 now: " + s2.toString());
        System.out.println("  The uppercase copy of s2: " + s2.toUpperCase().toString());
        System.out.println("The content in s2 now: " + s2.toString());
        System.out.println("  The reversal copy of s2: " + s2.reverse().toString());
        System.out.println("The content in s2 now: " + s2.toString());
    }
}
class MyStringBuilder {
    private char[] value; // Array to store characters
    private int count;    // Number of characters currently in the builder

    // Constructor for an empty MyStringBuilder
    public MyStringBuilder() {
        value = new char[16]; // Default capacity
        count = 0;
    }

    // Constructor to initialize with a char array
    public MyStringBuilder(char[] chars) {
        value = new char[chars.length + 16];
        System.arraycopy(chars, 0, value, 0, chars.length);
        count = chars.length;
    }

    // Constructor to initialize with a string
    public MyStringBuilder(String s) {
        value = new char[s.length() + 16];
        System.arraycopy(s.toCharArray(), 0, value, 0, s.length());
        count = s.length();
    }

    // Appends another MyStringBuilder to this one
    public MyStringBuilder append(MyStringBuilder s) {
        ensureCapacity(count + s.count);
        System.arraycopy(s.value, 0, value, count, s.count);
        count += s.count;
        return this;
    }

    // Appends an integer to the builder
    public MyStringBuilder append(int i) {
        return append(new MyStringBuilder(String.valueOf(i)));
    }

    // Returns the length of the builder
    public int length() {
        return count;
    }

    // Returns the character at a specified index
    public char charAt(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return value[index];
    }

    // Converts the content to lowercase
    public MyStringBuilder toLowerCase() {
        MyStringBuilder copy = new MyStringBuilder();
        for (int i = 0; i < count; i++) {
            copy.append(Character.toLowerCase(value[i]));
        }
        return copy;
    }

    // Converts the content to uppercase
    public MyStringBuilder toUpperCase() {
        MyStringBuilder copy = new MyStringBuilder();
        for (int i = 0; i < count; i++) {
            copy.append(Character.toUpperCase(value[i]));
        }
        return copy;
    }

    // Returns a substring from begin (inclusive) to end (exclusive)
    public MyStringBuilder substring(int begin, int end) {
        if (begin < 0 || end > count || begin > end) {
            throw new IndexOutOfBoundsException("Invalid range");
        }
        char[] sub = new char[end - begin];
        System.arraycopy(value, begin, sub, 0, end - begin);
        return new MyStringBuilder(sub);
    }

    // Returns a substring from begin (inclusive) to the end
    public MyStringBuilder substring(int begin) {
        return substring(begin, count);
    }

    // Converts the content to a string
    @Override
    public String toString() {
        return new String(value, 0, count);
    }

    // Reverses the content of the builder
    public MyStringBuilder reverse() {
        MyStringBuilder reversed = new MyStringBuilder();
        for (int i = count - 1; i >= 0; i--) {
            reversed.append(value[i]);
        }
        return reversed;
    }

    // Ensures the internal array has enough capacity
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > value.length) {
            int newCapacity = Math.max(minCapacity, value.length * 2);
            char[] newValue = new char[newCapacity];
            System.arraycopy(value, 0, newValue, 0, count);
            value = newValue;
        }
    }
}
