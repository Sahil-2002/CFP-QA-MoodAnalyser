package org.example;

public class MoodAnalyser {
    public String analyseMood(String message){
        if(message.contains("sad")){
            return "SAD";
        } else if (message.contains("happy")) {
            return "HAPPY";
        }
        return "";
    }
}
