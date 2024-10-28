package School;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        System.out.println(equation.getA() + "*x" + ((equation.getB() >= 0) ? "+" : "") + equation.getB() + "*y = " + equation.getE());
        System.out.println(equation.getC() + "*x" + ((equation.getD() >= 0) ? "+" : "") + equation.getD() + "*y = " + equation.getF());

        if (equation.isSolvable()) {
            System.out.println("x is " + equation.getX() + " and y is " + equation.getY());
        } else {
            System.out.println("The equation has no solution");
        }

        input.close();
    }
}
