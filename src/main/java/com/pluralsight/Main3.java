package com.pluralsight;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


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


        //START replace this code with a call to the method to do the formatting
        //Built a String for Billing Address
        String yourBillingAddress = createFormattedAddress(billingStreet, billingCity, billingState,billingZipCode);

        //END

        System.out.println("Is your Billing Address the same as your Shipping Address?(Yes or No) \n");
        String isAddressSame = scanner.nextLine().trim();

        if (isAddressSame.equalsIgnoreCase("Yes")) {

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

            //START replace this code with a call to the method to get a formatted string.
            //Built a String for Shipping Address
            String yourShippingAddress = createFormattedAddress(shippingStreet,shippingCity,shippingState,shippingZipCode);
            //END

            System.out.println(fullName + "\n" + "\n" +
                    "Billing Address: \n" +
                    yourBillingAddress + "\n" +
                    "\n" +
                    "Shipping Address: \n" +
                    yourShippingAddress + "\n");

        } else {

            System.out.println("Invalid Entry Please Try Again");
            //edit to try again

        }

    }

    public static String createFormattedAddress(String street, String city, String state, String zipCode){

            StringBuilder formattedAddress = new StringBuilder();

            //Built a String for Formatted Address
            formattedAddress.append(street + "\n");
            formattedAddress.append(city + ", ");
            formattedAddress.append(state + " ");
            formattedAddress.append(zipCode);

            String yourFormattedAddress = formattedAddress.toString();


        return yourFormattedAddress;



    }

}
