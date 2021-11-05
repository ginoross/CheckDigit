package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
         String barcode = "";
         int oddNum = 0;
         int evenNum = 0;
         int total = 0;
         int checkDigit = 0;

        char [] barcodeArr = new char[12];
        do{
            System.out.println("Please enter your 12 digit barcode: ");
            barcode = input.next();
            
        }while(barcode.length()<12);

        for (int i = 1; i < 12; i+=2) {
            oddNum+= Character.getNumericValue(barcode.charAt(i));

        }
        oddNum = oddNum*3;
        for (int i = 0; i < 12; i+=2) {
            evenNum+= Character.getNumericValue(barcode.charAt(i));
        }

        total = oddNum+evenNum;
        checkDigit = 10-(total%10);
        System.out.println("Your check digit is: "+checkDigit);

    }
}
