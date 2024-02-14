package org.example;

public class MoodAnalyser {
    private String message;
    public MoodAnalyser(){
        this.message="";

    }
    public MoodAnalyser(String message){
        this.message=message;
    }
    public String analyseMood(){
        if(message.contains("sad")){
            return "SAD";
        } else if (message.contains("happy")) {
            return "HAPPY";
        }
        else {
            return "Null";
        }

    }
}
