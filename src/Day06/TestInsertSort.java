package Day06;

public class TestInsertSort {
    public static void main(String[] args) {
        int [] scores = { 80, 70, 60, 50, 95};
        sort (scores);
        for (int score : scores) {
            System.out .print(score + "," );
        }
    }
    public static void sort(int [] arrays) {
        for (int i = 1; i < arrays.length ; i++) {
            int insertElement = arrays[i];//Take unsorted new elements
            int insertPosition = i;
            for (int j = insertPosition - 1; j >= 0; j--) {
                if (insertElement < arrays[j]) {// insertElement is shifted to the right
                    arrays[j + 1] = arrays[j];
                    insertPosition--;
                }else {
                    break ;
                }
            }
            arrays[insertPosition] = insertElement;//Insert the new element
        }
    }
}