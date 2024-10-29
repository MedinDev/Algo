package School;

import java.util.Scanner;

public class QuadraticEquation {
    // Private data fields for coefficients
    private double a, b, c;

    // Constructor that initializes a, b, and c
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter methods for a, b, and c
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Method to get the discriminant
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Method to get the first root
    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0; // Return 0 if discriminant is negative
        }
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    // Method to get the second root
    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0; // Return 0 if discriminant is negative
        }
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }
}

