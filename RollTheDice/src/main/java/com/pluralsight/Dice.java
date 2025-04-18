package com.pluralsight;

public class Dice {
    int minValue = 1;
    int maxValue = 6;

    public int roll(){
        int randomValue = (int) (Math.random() * maxValue) + minValue;
        return randomValue;
    }
}






