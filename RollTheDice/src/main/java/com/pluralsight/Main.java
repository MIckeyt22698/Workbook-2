package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1, roll2;

        int count2 = 0, count4 = 0, count6 = 0, count7 = 0;

        for (int i = 0; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            System.out.println("Roll " + i + ":" +
                    " " + roll1 + " - " + roll2 + " Sum: " + sum);

            if (sum == 2) {
                count2++;
            } else if (sum == 4) {
                count4++;
            } else if (sum == 6) {
                count6++;
            } else if (sum == 7) {
                count7++;
            }

        }
        System.out.println(count2 + " Twos " +  count4 + " Fours " + count6 + " Sixes " +count7 + " Sevens");
    }
}