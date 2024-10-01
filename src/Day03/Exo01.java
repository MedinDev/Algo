package Day03;

import java.util.Scanner;

public class Exo01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        function(n);

        scanner.close();
    }

    public static void function(int n) {
        for (int i = 1; i < n; i++) { // Start from 1 to avoid division by zero
            for (int j = i; j < i * i; j++) {
                if (j % i == 0) {
                    for (int k = 0; k < j; k++) {
                        System.out.print("* "); // Changed println to print for better formatting
                    }
                    System.out.println(); // Print a new line after each row of stars
                }
            }
        }
    }
}
