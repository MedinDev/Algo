package Exam_pre;

public class Exercice08 {
    public double moyenne (int[] nombres){
        int somme =0;
        for (int n : nombres){
            somme += n;
        }
        return (double) somme / nombres.length;
    }
    public static void main(String[] args) {
        Exercice08 exo = new Exercice08();
        int[] nombres = {1, 2, 3, 4, 5};
        System.out.println(exo.moyenne(nombres));
    }
}
