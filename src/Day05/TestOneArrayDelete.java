package Day05;

import java.util.Scanner;
public class TestOneArrayDelete {
    public static int [] delete(int [] array, int index){
// create a new array, length = array.length - 1
        int [] tempArray = new int [array.length - 1];
        for (int i = 0; i < array.length ; i++) {
            if (i < index) // Copy the data in front of index to the front of tempArray
                tempArray[i] = array[i];
            if (i > index) // Copy the array after index to the end of tempArray
                tempArray[i - 1] = array[i];
        }
        return tempArray;
    }
    public static void main(String[] args) {
        int [] scores = { 90, 70, 50, 80, 60, 85 };
        System.out .println("Please enter the index to be deleted:" );
        Scanner in = new Scanner(System.in );
        int index = in.nextInt();
        scores = delete (scores, index);
        for (int score : scores) {
            System.out.print(score + ",");
        }
    }
}