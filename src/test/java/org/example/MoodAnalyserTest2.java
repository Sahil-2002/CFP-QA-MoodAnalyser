package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest2 {

        @Test
        public void moodchecksad(){
            MoodAnalyser mood = new MoodAnalyser("I am in sad mood ");
            String result = mood.analyseMood();
            Assertions.assertEquals("SAD",result);
        }
        @Test
    public void moodcheckhappy(){
            MoodAnalyser mood = new MoodAnalyser("I am in happy Mood");
            String result = mood.analyseMood();
            Assertions.assertEquals("HAPPY",result);

        }
        @Test
    public void moodchecknull(){
        MoodAnalyser mood = new MoodAnalyser();
        String result = mood.analyseMood();
        Assertions.assertEquals("MoodAnalysisExceptionorg.example.MoodAnalyser$MoodAnalysisException: Empty Mood", result);

    }


    }

