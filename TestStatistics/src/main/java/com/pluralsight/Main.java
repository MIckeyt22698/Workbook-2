package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        int[] scores = {72, 87, 93, 68, 82, 97, 93, 42, 57, 99};

        int sum = 0;
        double average = 0;
        double lowest = scores[0];
        double highest = scores[0];

        for (int score : scores) {
            sum += score;


            if (score > highest) {
                highest = score;
            }

            if (score < lowest) {
                lowest = score;
            }
        }
        average = (double) sum / scores.length;


        System.out.println("Highest score: " + highest);
        System.out.println("Average score: " + average);
        System.out.println("Lowest score: " + lowest);


    }}
//}}
//
//int highest = scores[0];
//        for (int score : scores) {
//        if (score > highest) {
//highest = score;
//            }
//int lowest = scores[0];
//            for (int score : scores) {
//        if (score < lowest) {
//lowest = score;
//                }
//
//                        }
