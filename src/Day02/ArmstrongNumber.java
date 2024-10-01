package Day02;

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

public class ArmstrongNumber {

    public static void main(String[] args){
        int n, sum=0 , temp, remainder = 0,digits = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number to check if it is an Armstrong number");
        n=in.nextInt();temp = n;

        //Count number of digits
        While(temp !=0 );{
            sum = (int) (sum + power(remainder,digits));
            temp = temp/10;
        }
        if (n == sum)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }

    private static void While(boolean b) {
    }
}
