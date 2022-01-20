package org.vashonsd;


import java.util.Scanner;

public class Quiz {
    public String name;
    public Quiz (String yourName){
        name = yourName;
    }

    Scanner scanner = new Scanner(System.in);
    public void Q1(){
        System.out.println("We will start of with easy math problems that will progressively get harder. We will track your correct and incorrect answers as we go to see your overall math smarts. There are 8 questions total.");
        System.out.println("The first question is - If you have 10 bananas and you eat 5 of them then give 3 to a friend, how many do you have left?");
        int correctAnswer1 = 2;
        int Q1userAnswer = scanner.nextInt();
        if(correctAnswer1 == Q1userAnswer){
            System.out.println("Correct!");
        }else{
            System.out.println("Incorrect. The correct answer is " + correctAnswer1);
        }
    }
    public void Q2() {
        System.out.println("The next question is to find the area of the shown rectangle - ");
        System.out.println("         6");
        System.out.println("------------------");
        System.out.println("|                 |");
        System.out.println("|                 |  8/2");
        System.out.println("|                 |");
        System.out.println("------------------");
        int Q2UserAnswer = scanner.nextInt();
        int Q2CorrectAnswer = 24;
        if (Q2UserAnswer == Q2CorrectAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer was " + Q2CorrectAnswer);
        }
    }
    public void Q3(){
        System.out.println("The next problem is to the value of x.");
        System.out.println("5x + 10x - 30 = 0");
        int Q3UserAnswer = scanner.nextInt();
        int Q3CorrectAnswer = -2;
        if(Q3UserAnswer == Q3CorrectAnswer) {
            System.out.println("Correct!");
        }else {
            System.out.println("Incorrect. The correct answer is " + Q3CorrectAnswer);
        }
    }

    public void Q4(){
        System.out.println("Now, find the slope from the following equation: ");
        System.out.println("5x + 2 = y");
        int Q4UserAnswer = scanner.nextInt();
        int Q4CorrectAnswer = 5;
        if(Q4CorrectAnswer == Q4UserAnswer) {
            System.out.println("Correct!");
        }else {
            System.out.println("Incorrect. The correct answer is " + Q4CorrectAnswer);
        }
    }
    public void Q5(){
        System.out.println("Next question says to find the length of the missing side on the shown triangle -");
        System.out.println("              /|");
        System.out.println("            /  |");
        System.out.println("           /   | 4");
        System.out.println("          /    |");
        System.out.println("         /     |");
        System.out.println("         ------");
        System.out.println("            2");
        int Q5UserAnswer = scanner.nextInt();
        int Q5CorrectAnswer = 6;
        if(Q5CorrectAnswer == Q5UserAnswer) {
            System.out.println("Correct!");
        }else {
            System.out.println("Incorrect. The Correct answer is " + Q5CorrectAnswer);
        }
    }
    public void Q6(){
        System.out.println("Half way done. Question 6 asks you to find the circumference of a circle with a radius of 4.5 inches. Enter your answer rounded to the nearest hundredth. ");
        double Q6UserAnswer = scanner.nextInt();
        double Q6CorrectAnswer = 28.27;
        if(Q6CorrectAnswer == Q6UserAnswer) {
            System.out.println("Correct!");
        }else {
            System.out.println("Incorrect. The correct answer is " + Q6CorrectAnswer);
        }
    }
    public void Q7(){
        System.out.println("Question 7 - What is the cube root of 729?");
        int Q7UserAnswer = scanner.nextInt();
        int Q7CorrectAnswer = 9;
        if(Q7CorrectAnswer == Q7UserAnswer) {
            System.out.println("Correct!");
        }else {
            System.out.println("Incorrect. The correct answer is " + Q7CorrectAnswer);
        }
    }
    public void Q8(){
        System.out.println("Last question, solve this equation for x:  ");
        System.out.println("3x-2(x+3)=4x-7");
        System.out.println("enter fractions as x/y");
        int Q8UserAnswer = scanner.nextInt();
        int Q8CorrectAnswer = 1/3;
        if(Q8CorrectAnswer == Q8UserAnswer) {
            System.out.println("Correct!");
        }else {
            System.out.println("Incorrect. The correct answer is " + Q8CorrectAnswer);
        }
    }



    public void finishedQuiz(){
        System.out.println("Congratulations on finishing the quiz!");
        }
}








