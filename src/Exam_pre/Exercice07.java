package Exam_pre;

public class Exercice07 {
    public void verifierPairImpair (int n){
        if (n % 2 ==0){
            System.out.println("Le nombre est pair");
        }else {
            System.out.println("Le nombre est impair");
        }
    }
    public static void main(String[] args) {
        Exercice07 exo = new Exercice07();
        exo.verifierPairImpair(5);
        exo.verifierPairImpair(6);
    }
}
