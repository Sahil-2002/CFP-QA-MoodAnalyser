package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {
    @Test
    public void moodchecksad(){
        MoodAnalyser mood = new MoodAnalyser();
        String result = mood.analyseMood("I am in sad Mood");
        Assertions.assertEquals("SAD",result);
    }

}