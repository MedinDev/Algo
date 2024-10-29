package Day06;

import java.util.Scanner;

public class TestOneArraySearch {
    public static int search(int[] array, int value) {
        for (int i=0; i< array.length; i++){
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]scores = {90, 70, 50, 80, 60, 85};
        System.out.println("Please enter the value you want to search :");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        int index = search(scores, value);
        if(index > 0){
            System.out.println("Found value: "+ value + " The index is: "+ index);
        }else {
            System.out.println("The value was not Found : " + value);
        }
    }
}
