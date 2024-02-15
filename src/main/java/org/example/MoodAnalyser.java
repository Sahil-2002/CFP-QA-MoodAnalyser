package org.example;

public class MoodAnalyser {

    private String message;
    enum Mood{
        HAPPY,SAD,NULL,EMPTY;
    }
    class MoodAnalysisException extends Exception{
        MoodAnalysisException(String message) {
super(message);
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
            if (message.isEmpty()) {
                throw new MoodAnalysisException("Empty Mood");
            }
        }
            catch (MoodAnalysisException e) {
                return "MoodAnalysisException"+e;
            }
            if (message.contains("sad")) {
                return "SAD";
            } else if (message.contains("happy")) {
                return "HAPPY";
            }


return "";
    }


}
