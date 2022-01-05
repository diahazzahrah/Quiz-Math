package com.example.kuiskuis;


public class Question {
    private String textQuestions [] = {
            "1. 9x3 + 7x2 - 4 = ....",
            "2. 5:2 + 10.5 = ....",
            "3. 10p = 5, p = ...",
            "4. 42+10+3 - 40 = ... ",
            "5. (10+9.5) x 2 = ..."

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"27", "14", "10", "37"},
            {"2.5", "13", "10.5", "5"},
            {"2", "1", "1/2", "0.05"},
            {"15", "52", "55", "45"},
            {"19.5", "39", "29", "28"}
    };

    private String mCorrectAnswers[] = {"37", "13", "1/2", "15", "39"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
