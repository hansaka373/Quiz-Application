package QuizApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {


    public void logic(){
    Questions question1 = new Questions("Which statement is true about Java?","A. Java is a sequence-dependent programming language","B. Java is a code dependent programming language", "C. Java is a platform-dependent programming language", "D. Java is a platform-independent programming language");
    Questions question2 = new Questions("What is the extension of java code files?", " A. .txt", "B. .pdf", "C. .sql", "D. .java");
    Questions question3 = new Questions("Who invented Java Programming? ", "A. Guido van Rossum", "B. James Gosling", "C. Dennis Ritchie", "D. Bjarne Stroustrup");
    Questions question4 = new Questions("Which one of the following is not a Java feature?", "A. Object-oriented", "B. Use of pointers", "C. Portable", "D. Dynamic and Extensible");
    Questions question5 = new Questions("Which of these cannot be used for a variable name in Java?", "A. identifier & keyword", "B. identifier", "C. Keyword", "D. none of the mentioned");

    Map<Questions, Character> hashMap = new HashMap<>();
    hashMap.put(question1,'D');
    hashMap.put(question2,'D');
    hashMap.put(question3,'B');
    hashMap.put(question4,'B');
    hashMap.put(question5,'C');

    Scanner sc = new Scanner(System.in);
    int marks = 0;

    for (Map.Entry<Questions, Character> map: hashMap.entrySet()){
        System.out.println(map.getKey().getQuestion());
        System.out.println("");
        System.out.println(map.getKey().getOption1());
        System.out.println(map.getKey().getOption2());
        System.out.println(map.getKey().getOption3());
        System.out.println(map.getKey().getOption4());

        System.out.println("Enter your answer");
        Character answer = sc.next().charAt(0);

        if (map.getValue() == answer){
            System.out.println("Correct answer.");
            System.out.println("");
            marks+=1;
        }else{
            System.out.println("Wrong answer.");
            System.out.println("Correct answer is "+map.getValue());
            System.out.println("");
        }
    }
        System.out.println("Your marks: "+marks);
        System.out.println("Number of questions faced :"+hashMap.size());
        System.out.println("Your marks: "+(100*marks)/hashMap.size()+"%");
    }
}
