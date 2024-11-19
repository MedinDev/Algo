package School;

import java.util.Scanner;

// MyString class implementation
class MyString {
    private char[] chars;

    // Constructor to initialize the MyString object with a char array
    public MyString(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    // Converts the MyString object to a char array
    public char[] toChars() {
        char[] result = new char[chars.length];
        System.arraycopy(chars, 0, result, 0, chars.length);
        return result;
    }

    // Returns the character at the specified index
    public char charAt(int index) {
        if (index < 0 || index >= chars.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return chars[index];
    }

    // Returns the length of the MyString
    public int length() {
        return chars.length;
    }

    // Returns a substring from begin (inclusive) to end (exclusive)
    public MyString substring(int begin, int end) {
        if (begin < 0 || end > chars.length || begin > end) {
            throw new IndexOutOfBoundsException("Invalid range");
        }
        char[] subChars = new char[end - begin];
        System.arraycopy(chars, begin, subChars, 0, end - begin);
        return new MyString(subChars);
    }

    // Returns a substring from begin (inclusive) to the end of the MyString
    public MyString substring(int begin) {
        return substring(begin, chars.length);
    }

    // Converts the MyString to lowercase
    public MyString toLowerCase() {
        char[] lowerChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            lowerChars[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString(lowerChars);
    }

    // Converts the MyString to uppercase
    public MyString toUpperCase() {
        char[] upperChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            upperChars[i] = Character.toUpperCase(chars[i]);
        }
        return new MyString(upperChars);
    }

    // Creates a MyString object from an integer
    public static MyString valueOf(int i) {
        return new MyString(Integer.toString(i).toCharArray());
    }

    // Creates a MyString object from a boolean
    public static MyString valueOf(boolean b) {
        return new MyString(Boolean.toString(b).toCharArray());
    }
}

// Test class to demonstrate the functionality of MyString
public class Test05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String ts = input.nextLine();
        char[] tc = ts.toCharArray();

        MyString s = new MyString(tc);
        printMyString(s);
        System.out.println("  There are " + s.length() + " characters");
        System.out.println("  The last character is " + s.charAt(s.length() - 1));

        MyString subs = s.substring(6);
        System.out.print("  The substring from the index of 6: ");
        printMyString(subs);

        System.out.print("  The substring in the index range of (6,9]: ");
        subs = s.substring(6, 9);
        printMyString(subs);

        s = s.toUpperCase();
        System.out.print("The uppercase one: ");
        printMyString(s);

        s = s.toLowerCase();
        System.out.print("The lowercase one: ");
        printMyString(s);

        System.out.println("\nExtra test: ");
        s = MyString.valueOf(12345);
        printMyString(s);

        s = MyString.valueOf(true);
        printMyString(s);

        input.close();
    }

    public static void printMyString(MyString s) {
        char[] chars = s.toChars();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }
}
