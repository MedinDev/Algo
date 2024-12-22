package Exam_pre;

public class Exercice04 {
    public String verifierNombre(int n) {
        if (n > 0) {
            return "Positif";
        } else if (n < 0) {
            return "négatif";
        }else {
            return "Nul";
        }
    }
    public static void main(String[] args) {
        Exercice04 ex = new Exercice04();
        System.out.println(ex.verifierNombre(0));
        System.out.println(ex.verifierNombre(1));
        System.out.println(ex.verifierNombre(-1));
    }
}
