package Day01;

import java.util.Scanner;

class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");

        int m = in.nextInt();
        int n = in.nextInt();

        int[][] first = new int[m][n];
        int[][] second = new int[m][n];
        int[][] sum = new int[m][n];

        System.out.println("Enter the elements of first matrix");
        for (int c = 0; c < m; c++) {
            for (int d = 0; d < n; d++) {
                first[c][d] = in.nextInt();
            }
        }

        System.out.println("Enter the elements of second matrix");
        for (int c = 0; c < m; c++) {
            for (int d = 0; d < n; d++) {
                second[c][d] = in.nextInt();
            }
        }

        for (int c = 0; c < m; c++) {
            for (int d = 0; d < n; d++) {
                sum[c][d] = first[c][d] + second[c][d];
            }
        }

        System.out.println("Sum of entered matrices:");
        for (int c = 0; c < m; c++) {
            for (int d = 0; d < n; d++) {
                System.out.print(sum[c][d] + "\t");
            }
            System.out.println();
        }
    }
}