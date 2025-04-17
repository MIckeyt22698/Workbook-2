package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyStrokes = new Scanner(System.in);

        String firsName = "";
        String middleName = "";
        String lastName = "";
        System.out.println("give me your damn name:");
        String fullName = keyStrokes.nextLine();

        int firstBreakPoint = fullName.indexOf(' ');
        int lastBreakPoint = fullName.lastIndexOf(' ');

        if (firstBreakPoint == -1) {
            firsName = fullName;
        } else {
            firsName = fullName.substring(0, firstBreakPoint);
        }
        if (firstBreakPoint != lastBreakPoint) {
            middleName = fullName.substring(firstBreakPoint + 1, lastBreakPoint);
            lastName = fullName.substring(lastBreakPoint + 1);
        } else {
            lastName = fullName.substring(firstBreakPoint + 1);
        }
        System.out.println("First name: " + firsName);
        if (!middleName.isEmpty()) {
            System.out.println("Middle name: " + middleName);
        }
            System.out.println("Last name: " + lastName);
        }










        }





