package org.example;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        this.message ="";

    }

    public MoodAnalyser(String message) {
        this.message = message;
    }


    public String analyseMood() {
        try {
            if (message == null) {
                throw new NullPointerException("message cannot be null");
            }
            }
            catch (NullPointerException e) {
                return "HAPPY";
            }
            if (message.contains("sad")) {
                return "SAD";
            } else if (message.contains("happy")) {
                return "HAPPY";
            }


return "";
    }

}
