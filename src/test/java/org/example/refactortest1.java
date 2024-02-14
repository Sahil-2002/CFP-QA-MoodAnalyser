package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class refactortest1 {
    @Test
    public void moodchecksad(){
        MoodAnalyser mood = new MoodAnalyser("I am in sad mood ");
        String result = mood.analyseMood();
        Assertions.assertEquals("SAD",result);
    }

}