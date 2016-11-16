package com.example.fabianfalck.learngerman_p1.vocabulary;

/**
 * Created by FabianFalck on 13/11/2016.
 */

public class Feedback {

    public int timeLearned = 0; //time starred at this vocabulary
    public String status = ""; //4 different status feedbacks

    public Feedback(int timeLearned, String status){
        this.timeLearned = timeLearned;
        this.status = status;
    }

}
