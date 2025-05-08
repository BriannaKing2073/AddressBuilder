package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder billingAddress = new StringBuilder();
        StringBuilder shippingAddress = new StringBuilder();

        //Collect Billing Address
        System.out.println("Please provide the following information: \n" +
                "Full Name(firstname lastname): ");
        String fullName = scanner.nextLine().trim();

        System.out.println("Enter Your Billing Address: \n" +
                "Street: ");
        String billingStreet = scanner.nextLine().trim();

        System.out.println("City: ");
        String billingCity = scanner.nextLine().trim();

        System.out.println("State (ex.TX): ");
        String billingState = scanner.nextLine().trim();

        System.out.println("Zip Code: ");
        String billingZipCode = scanner.nextLine().trim();

        //Built a String for Billing Address
        billingAddress.append(billingStreet + "\n");
        billingAddress.append(billingCity + ", ");
        billingAddress.append(billingState + " ");
        billingAddress.append(billingZipCode);
        String yourBillingAddress = billingAddress.toString();


        System.out.println("Is your Billing Address the same as your Shipping Address?(Yes or No) \n");
        String isAddressSame = scanner.nextLine().trim();

        if (isAddressSame.equalsIgnoreCase("Yes")){
            System.out.println(fullName + "\n" + "\n" +
                    "Billing Address: \n" +
                   yourBillingAddress + "\n" +
                    "\n" +
                    "Shipping Address: \n" +
                    yourBillingAddress + "\n");
        } else if (isAddressSame.equalsIgnoreCase("No")) {

            System.out.println("Enter Your Shipping Address: \n" +
                    "Street: ");
            String shippingStreet = scanner.nextLine().trim();

            System.out.println("City: ");
            String shippingCity = scanner.nextLine().trim();

            System.out.println("State (ex.TX): ");
            String shippingState = scanner.nextLine().trim();

            System.out.println("Zip Code: ");
            String shippingZipCode = scanner.nextLine().trim();

            //Built a String for Shipping Address
            shippingAddress.append(shippingStreet + "\n");
            shippingAddress.append(shippingCity + ", ");
            shippingAddress.append(shippingState + " ");
            shippingAddress.append(shippingZipCode);
            String yourShippingAddress = shippingAddress.toString();

            System.out.println(fullName + "\n" + "\n" +
                    "Billing Address: \n" +
                    yourBillingAddress + "\n" +
                    "\n" +
                    "Shipping Address: \n" +
                    yourShippingAddress + "\n");


        }
        else {
            System.out.println("Invalid Entry Please Try Again");
            //edit to try again
        }

    }
}