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

        billingAddress.append(billingStreet).append("\n");
        billingAddress.append(billingCity).append(", ");
        billingAddress.append(billingState).append(" ");
        billingAddress.append(billingZip);

        System.out.println("Is your billing adress the same as your shipping address? (y/n): ");
        String sameAddress = keystrokes.nextLine().trim();


        if (sameAddress.equals("n")){

        System.out.println("Shipping Street :");
        String shippingStreet = keystrokes.nextLine().trim();

        System.out.println("Shipping City? :");
        String shippingCity = keystrokes.nextLine().trim();

        System.out.println("Shipping State? :");
        String shippingState = keystrokes.nextLine().trim();

        System.out.print("Shipping Zip: ");
        String shippingZip = keystrokes.nextLine().trim();

        StringBuilder shippingAddress = new StringBuilder();

            shippingAddress.append(shippingStreet).append("\n");
            shippingAddress.append(shippingCity).append(", ");
            shippingAddress.append(shippingState).append(" ");
            shippingAddress.append(shippingZip);

            System.out.println("\nShipping Address:");
            System.out.println(shippingAddress);;

        }
        System.out.println("\nFull name: " + fullName);
        System.out.println("\nBilling Address:");
        System.out.println(billingAddress);
        //Stanley was here

    }


}