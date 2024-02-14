package org.example;

public class MoodAnalyser {

    private String message;
    class MoodAnalysisException extends Exception{
        MoodAnalysisException(String message) {

        }

    }

    public MoodAnalyser() {
        this.message ="";

    }

    public MoodAnalyser(String message) {
        this.message = message;
    }


    public String analyseMood() {
        try {
            if (message == null) {
                throw new MoodAnalysisException ("message cannot be null");
            }
            }
            catch (MoodAnalysisException e) {
                return "MoodAnalysisException";
            }
            if (message.contains("sad")) {
                return "SAD";
            } else if (message.contains("happy")) {
                return "HAPPY";
            }


return "";
    }


}
