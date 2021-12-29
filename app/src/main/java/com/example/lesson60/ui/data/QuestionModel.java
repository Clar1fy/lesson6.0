package com.example.lesson60.ui.data;

import java.io.Serializable;

public class QuestionModel implements Serializable {
    private String level;
    private String quiz;
    private String firstAnswer;
    private String secondAnswer;
    private String thirdAnswer;
    private String correctAnswer;

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getLevel() {
        return level;
    }

    public String getQuiz() {
        return quiz;
    }

    public String getFirstAnswer() {
        return firstAnswer;
    }

    public String getSecondAnswer() {
        return secondAnswer;
    }

    public String getThirdAnswer() {
        return thirdAnswer;
    }

    public String getFourthAnswer() {
        return fourthAnswer;
    }

    public String getFifthAnswer() {
        return fifthAnswer;
    }

    public QuestionModel(String level, String quiz, String firstAnswer, String secondAnswer, String thirdAnswer, String fourthAnswer, String fifthAnswer, String correctAnswer) {
        this.level = level;
        this.quiz = quiz;
        this.firstAnswer = firstAnswer;
        this.secondAnswer = secondAnswer;
        this.thirdAnswer = thirdAnswer;
        this.fourthAnswer = fourthAnswer;
        this.fifthAnswer = fifthAnswer;
        this.correctAnswer = correctAnswer;
    }

    private String fourthAnswer;
    private String fifthAnswer;

}
