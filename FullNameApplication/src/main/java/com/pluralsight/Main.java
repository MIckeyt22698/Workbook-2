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

        if (middle.isEmpty()){
            fullName.
        }












    }
}