package Exam_pre;

public class Exercise02 {
    public void direBonjour(String prenom) {
        System.out.println("Bonjour " + prenom +"!");
    }
    public static void main(String[] args) {
        Exercise02 e = new Exercise02();
        e.direBonjour("John");
    }
}
