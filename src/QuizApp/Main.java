package QuizApp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Quiz game.");
        System.out.println("============================================");
        System.out.println("");
        System.out.println("Enter your answer after the question as A,B,C or D");
        System.out.println("");

        Quiz quiz = new Quiz();
        quiz.logic();


    }
}
