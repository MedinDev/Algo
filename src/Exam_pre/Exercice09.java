package Exam_pre;

public class Exercice09 {
    public int[] inverserTableau (int[] tableau)
    {
        int [] tableauInverse = new int[tableau.length];
        for (int i = 0; i < tableau.length; i++) {
            tableauInverse[i] = tableau[tableau.length - 1 - i];
        }
        return tableauInverse;
    }
    public static void main(String[] args)
    {
        int[] tableau = {1, 2, 3, 4, 5};
        Exercice09 exercice09 = new Exercice09();
        int[] tableauInverse = exercice09.inverserTableau(tableau);
        for (int i = 0; i < tableauInverse.length; i++) {
            System.out.println(tableauInverse[i]);
        }
    }
}
