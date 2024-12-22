package Day07;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers separated by spaces or a single number: ");
        String input = in.nextLine();

        int sum = 0;
        if (input.contains(" ")) {
            String[] numbers = input.split(" ");
            for (String num : numbers) {
                sum += Integer.parseInt(num);
            }
        } else {
            for (char digit : input.toCharArray()) {
                sum += Character.getNumericValue(digit);
            }
        }

        System.out.println("The sum of the numbers is: " + sum);
    }
}