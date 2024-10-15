package Day05;

public class TestOneArrayAppend {
   public static int [] append (int [] array, int value){
       //create a new array .length = array.length + 1

       int [] tempArray = new int [array.length + 1];
       for (int i=0; i< array.length; i++){
           tempArray[i] = array[i];
       }
       tempArray[array.length] = value;
               return tempArray;
   }

   public static void main (String[] args){
       int[] scores = {90, 70, 50, 80, 60, 85};
       scores = append(scores, 75);
       for (int i = 0; i<scores.length; i++){
           System.out.println(scores[i] + ",");
       }
   }
}