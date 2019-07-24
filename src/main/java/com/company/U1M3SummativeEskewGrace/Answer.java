package com.company.U1M3SummativeEskewGrace;


public class Answer {

    //VARIABLES
    private String question;
    private String answer;

    //EMPTY CONSTRUCTOR FOR POSTMAN PURPOSES ***DO NOT ERASE**
    public void Answer() {}

    // CONSTRUCTOR
    public Answer(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    // GETSET
    public String getQuestion() {return this.question;}
    public void setQuestion(String question) {this.question = question;}

    public String getAnswer() {return this.answer;}
    public void setAnswer(String answer) {this.answer = answer;}

}
