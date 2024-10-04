package Day04;


public class TestMaxValue {
    public static void main(String[] args) {
        int [] scores = { 60, 50, 95, 80, 70 };
        int maxValue = max (scores);
        System.out .println("Max Value = " + maxValue);
    }
    public static int max(int [] arrays) {
// Maximum initialization value is 0
        for (int i = 0; i < arrays.length - 1; i++) {
            if (arrays[i] > arrays[i + 1]) { // swap
                int temp = arrays[i];
                arrays[i] = arrays[i + 1];
                arrays[i + 1] = temp;
            }
        }
        int maxValue = arrays[arrays.length - 1];
        return maxValue;
    }
}
