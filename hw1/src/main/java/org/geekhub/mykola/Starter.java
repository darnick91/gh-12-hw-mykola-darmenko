package org.geekhub.mykola;

import java.util.Scanner;

import static org.geekhub.mykola.PhoneNumberValidator.isValid;
import static org.geekhub.mykola.PrintSumOfPhoneNumberDigits.printSum;

public class Starter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the phone number: ");

        while (true) {
            String line = scanner.nextLine();
            if(isValid(line)) {
                printSum(line);
                break;
            } else
                System.out.println("Phone number is incorrect. Please enter the phone number: ");
        }
        scanner.close();
    }
}
