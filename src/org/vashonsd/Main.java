package org.vashonsd;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.println("Hello. Ready to start your eight question quiz? Enter your name to start!");
        String name = scan.nextLine();
        Quiz startQuiz = new Quiz(name);
        startQuiz.Q1();
        startQuiz.Q2();
        startQuiz.Q3();
        startQuiz.Q4();
        startQuiz.Q5();
        startQuiz.Q6();
        startQuiz.Q7();
        startQuiz.Q8();
        startQuiz.finishedQuiz();



    }
}
