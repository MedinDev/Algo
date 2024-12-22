package Exam_pre;

public class Exercice10 {
    public boolean rechercher (int []tableau, int element){
        for (int n : tableau) {
            if (n==element){
                return true;
            }
        }
        return false;
    }
    public static void main (String[] args){
        Exercice10 ex = new Exercice10();
        int[] tableau = {1, 2, 3, 4, 5};
        System.out.println(ex.rechercher(tableau, 3));
        System.out.println(ex.rechercher(tableau, 6));
    }
}
