package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keystrokes = new Scanner(System.in);

        System.out.println("give me your name or else? :");

        System.out.println("First name :");
        String first = keystrokes.nextLine();

        System.out.println("middle initial (press Enter to skip)? :");
        String middle = keystrokes.nextLine();

        System.out.println("last name? :");
        String last = keystrokes.nextLine();

        System.out.print("Enter your suffix (e.g., Jr, PhD) (press Enter to skip): ");
        String suffix = keystrokes.nextLine().trim();


        StringBuilder fullName = new StringBuilder();

        fullName.append(first).append(" ");



        if (middle.isEmpty()){
            fullName.append(middle).append("");
        }
        else {fullName.append(middle).append(" ");}


        fullName.append(last).append("");

        if (!suffix.isEmpty() ){
            fullName.append(", ").append(suffix);
        }













        System.out.println("Full Name: " + fullName);












    }
}