package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keystrokes = new Scanner(System.in);

        System.out.println("give me your address now");

        System.out.println("Full name :");
        String fullName = keystrokes.nextLine().trim();

        System.out.println("Billing Street :");
        String billingStreet = keystrokes.nextLine().trim();

        System.out.println("Billing City? :");
        String billingCity = keystrokes.nextLine().trim();

        System.out.println("Billing State? :");
        String billingState = keystrokes.nextLine().trim();

        System.out.print("Billing Zip: ");
        String billingZip = keystrokes.nextLine().trim();

        StringBuilder billingAddress = new StringBuilder();

        System.out.println("Full name: " + fullName);

        billingAddress.append(billingStreet).append("\n");
        billingAddress.append(billingCity).append(", ");
        billingAddress.append(billingState).append(" ");
        billingAddress.append(billingZip);

        String shippingHome = billingAddress.toString();
        System.out.println(shippingHome);
        //Stanley was here

    }
}