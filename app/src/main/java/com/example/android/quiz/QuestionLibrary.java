package com.example.android.quiz;

import static android.R.string.no;

public class QuestionLibrary {

    private String mQuestions [] = {
            "What kind of breakfast is good to prevent high glucose level in your blood?",
            "Which fruit contains the least Carbohydrate of the below?",
            "What are the three core elements that you need to implement in your life in order to stay healthy?",
    };

private String mChoices [][] = {
        {"Milk with Cornflakes", "Eggs, ham, traditional bread", "Whole grain bread, cheese, vegetables"},
        {"Cherry", "Watermelon", "Berries"},
        {"Working hard, no relaxing, lots of coffee", "Fun, Lots of movies, Cornflakes", "Sport, Healthy Diet, Medication"},
        };

private String mCorrectAnswers[][] = {
        {"Whole grain bread, cheese, vegetables","Berries","Sport, Healthy Diet, Medication"},
        };

public String getQuestion (int a) {
    String question = mQuestions[a];
    return question;
}

    public String getChoice1 (int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2 (int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3 (int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

        public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a][0];
        return answer;
    }
    }