package Exam_pre;

public class Exercice06 {
    public int factorielle (int n)
    {
        int resultat = 1;
        for (int i = 1; i <= n; i++)
        {
            resultat = resultat * i;
        }
        return resultat;
    }
    public static void main(String[] args)
    {
        Exercice06 ex = new Exercice06();
        System.out.println(ex.factorielle(5));
    }
}
