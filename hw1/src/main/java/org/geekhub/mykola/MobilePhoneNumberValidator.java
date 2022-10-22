package org.geekhub.mykola;

import java.util.Scanner;

public class MobilePhoneNumberValidator {
    public boolean conditionTypeOne(String s) {
        return (s.startsWith("093") || s.startsWith("063") ||
                s.startsWith("097") || s.startsWith("067")) && s.length() == 10;
    }

    public boolean conditionTypeTwo(String s) {
        return s.contains("093") || s.contains("063") ||
                s.contains("097") || s.contains("067");
    }

    public boolean conditionTypeThree(String s) {
        return (s.startsWith("8") && s.length() == 11) || (s.startsWith("+38") && s.length() == 13) ||
                (s.startsWith("0038") && s.length() == 14);
    }

    public void validatePhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the phone number:");
        String line = scanner.nextLine();
        if (conditionTypeOne(line) || (conditionTypeTwo(line) && conditionTypeThree(line))) {
            System.out.println("Phone number is correct.");
            try {
                boolean isFinished = true;
                long numb = Long.parseLong(line.trim());
                while (isFinished) {
                    for (int i = 0; isFinished; i++) {
                        int sum = getSum(numb);
                        numb = sum;
                        System.out.println(i + 1 + "st " + "round of calculation, sum is: " + sum);
                        if (sum > 0 && sum < 10) {
                            isFinished = false;
                            displayResult(sum);
                        }
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid string format!");
            }
        } else {
            System.out.println("Phone number is incorrect. Please enter the phone number: ");
            validatePhoneNumber();
        }

    }

    private int getSum(long numb) {
        int sum;
        for (sum = 0; numb != 0; numb /= 10) {
            sum += numb % 10;
        }
        return sum;
    }

    private void displayResult(int sum) {
        switch (sum) {
            case 1:
                System.out.println("Final result is: One");
                break;
            case 2:
                System.out.println("Final result is: Two");
                break;
            case 3:
                System.out.println("Final result is: Three");
                break;
            case 4:
                System.out.println("Final result is: Four");
                break;
            default:
                System.out.println("Final result is: " + sum);
                break;
        }
    }
}
