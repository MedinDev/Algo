package Exam_pre;

public class Exercice05 {
    public int max(int a, int b){
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Exercice05 ex = new Exercice05();
        System.out.println(ex.max(1, 2));
    }

}
