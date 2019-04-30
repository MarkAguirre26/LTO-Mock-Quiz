package com.drive.q.model;

public class Item {

    private String Question;
    private String ChoiceA;
    private String ChoiceB;
    private String ChoiceC;
    private String Answer;

    public Item(String question, String choiceA, String choiceB, String choiceC, String answer) {
        Question = question;
        ChoiceA = choiceA;
        ChoiceB = choiceB;
        ChoiceC = choiceC;
        Answer = answer;
    }


    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getChoiceA() {
        return ChoiceA;
    }

    public void setChoiceA(String choiceA) {
        ChoiceA = choiceA;
    }

    public String getChoiceB() {
        return ChoiceB;
    }

    public void setChoiceB(String choiceB) {
        ChoiceB = choiceB;
    }

    public String getChoiceC() {
        return ChoiceC;
    }

    public void setChoiceC(String choiceC) {
        ChoiceC = choiceC;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    @Override
    public String toString() {
        return "Item{" +
                "Question='" + Question + '\'' +
                ", ChoiceA='" + ChoiceA + '\'' +
                ", ChoiceB='" + ChoiceB + '\'' +
                ", ChoiceC='" + ChoiceC + '\'' +
                ", Answer='" + Answer + '\'' +
                '}';
    }

}
