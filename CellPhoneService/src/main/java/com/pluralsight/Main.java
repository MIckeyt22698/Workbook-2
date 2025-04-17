package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner keystroke = new Scanner(System.in);

        System.out.println("What is the serial number?: ");
        int  serialNumber = keystroke.nextInt();

        keystroke.nextLine();

        System.out.println("What model is the phone? : ");
        String  model = keystroke.nextLine().trim();

        System.out.println("Who is the carrier?? : ");
        String carrier = keystroke.nextLine().trim();

        System.out.println("What is the phone number?: ");
        String  phoneNumber = keystroke.nextLine().trim();

        System.out.println("Who is the owner of the phone?: ");
        String  owner = keystroke.nextLine().trim();


        Cellphone  cellphone = new Cellphone();

        cellphone.setSerialNumber(serialNumber);
        cellphone.setModel(model);
        cellphone.setCarrier(carrier);
        cellphone.setOwner(owner);
        cellphone.setPhoneNUmber(phoneNumber);



        cellphone.printInfo();

        }





    }
