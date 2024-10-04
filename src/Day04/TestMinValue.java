package Day04;

public class TestMinValue {
    public static void main(String[] args) {
        int [] scores = {60, 80, 95, 50, 70};
        int minValue = min(scores);
        System.out.println("Min Value = " + minValue);
    }
    public static int min (int[] arrays){
        int minIndex = 0; //the index of the minimum
        for (int j = 1; j<arrays.length; j++){
            if (arrays[minIndex] > arrays[j]){
                minIndex = j;
            }
        }
        return arrays[minIndex];
    }
}
