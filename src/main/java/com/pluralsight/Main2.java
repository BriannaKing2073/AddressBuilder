//package com.pluralsight;
//
//import java.util.Scanner;
//
//public class Main2 {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Billing Address");
//        createFormattedAddress();
//        yourFormattedAddress billingAddress = new yourFormattedAddress;
//
//        System.out.println("Is your Billing Address the same as your Shipping Address?(Yes or No) \n");
//        String isAddressSame = scanner.nextLine().trim();
//
//        if (isAddressSame.equalsIgnoreCase("Yes")){
//            System.out.println(fullName + "\n" + "\n" +
//                    "Billing Address: \n" +
//                   yourFormattedAddress + "\n" +
//                    "\n" +
//                    "Shipping Address: \n" +
//                    yourFormattedAddress + "\n");
//        } else if (isAddressSame.equalsIgnoreCase("No")) {
//
//            System.out.println("Shipping Address");
//            createFormattedAddress();
//
//            System.out.println(fullName + "\n" + "\n" +
//                    "Billing Address: \n" +
//                    yourBillingAddress + "\n" +
//                    "\n" +
//                    "Shipping Address: \n" +
//                    yourShippingAddress + "\n");
//
//
//        }
//        else {
//            System.out.println("Invalid Entry Please Try Again");
//            //edit to try again
//        }
//
//    }
//
//    public static String createFormattedAddress(String street, String city, String state, String zip){
//
//        Scanner scanner = new Scanner(System.in);
//        StringBuilder formattedAddress = new StringBuilder();
//
//        //Collect Address
//        System.out.println("Please provide the following information: \n" +
//                "Full Name(firstname lastname): ");
//        String fullName = scanner.nextLine().trim();
//
//        System.out.println("Enter Your Address: \n" +
//                "Street: ");
//        String addressStreet = scanner.nextLine().trim();
//
//        System.out.println("City: ");
//        String addressCity = scanner.nextLine().trim();
//
//        System.out.println("State (ex.TX): ");
//        String addressState = scanner.nextLine().trim();
//
//        System.out.println("Zip Code: ");
//        String addressZipCode = scanner.nextLine().trim();
//
//        //Built a String for Formatted Address
//        formattedAddress.append(addressStreet + "\n");
//        formattedAddress.append(addressCity + ", ");
//        formattedAddress.append(addressState + " ");
//        formattedAddress.append(addressZipCode);
//        String yourFormattedAddress = formattedAddress.toString();
//
//
//        return yourFormattedAddress;
//    }
//
//}