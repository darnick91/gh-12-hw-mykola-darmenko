package org.geekhub.mykola;

import java.util.Scanner;

public class MobilePhoneNumberValidator {
    private boolean conditionTypeOne(String s) {
        return (s.startsWith("093") || s.startsWith("063") ||
                s.startsWith("097") || s.startsWith("067")) && s.length() == 10;
    }

    private boolean conditionTypeTwo(String s) {
        return (s.contains("093") || s.contains("063") || s.contains("097") || s.contains("067"))
                && (s.contains("0") || s.contains("1") || s.contains("2") || s.contains("3") || s.contains("4")
                || s.contains("5") || s.contains("6") || s.contains("7") || s.contains("8") || s.contains("9"));
    }

    private boolean conditionTypeThree(String s) {
        return (s.startsWith("8") && s.length() == 11) || (s.startsWith("+38") && s.length() == 13) ||
                (s.startsWith("0038") && s.length() == 14);
    }

    public void validatePhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the phone number:");
        String line = scanner.nextLine();
        if (((conditionTypeOne(line) && conditionTypeTwo(line)) ||
                (conditionTypeThree(line) && conditionTypeTwo(line))) && isDigitPresent(line)) {
            long numb;
            try {
                numb = Long.parseLong(line.trim());
                boolean isFinished = true;
                while (isFinished) {
                    for (int i = 0; isFinished; i++) {
                        int sum = getSum(numb);
                        numb = sum;
                        displayCalculationResult(i, sum);
                        if (sum > 0 && sum < 10) {
                            isFinished = false;
                            displayFinalResult(sum);
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

    private void displayCalculationResult(int i, int sum) {
        switch (i + 1) {
            case 1:
                System.out.println(i + 1 + OrdinalNumbers.ST.getTitle() + " round of calculation, sum is: " + sum);
                break;
            case 2:
                System.out.println(i + 1 + OrdinalNumbers.ND.getTitle() + " round of calculation, sum is: " + sum);
                break;
            case 3:
                System.out.println(i + 1 + OrdinalNumbers.RD.getTitle() + " round of calculation, sum is: " + sum);
                break;
            case 4:
                System.out.println(i + 1 + OrdinalNumbers.TH.getTitle() + " round of calculation, sum is: " + sum);
                break;
        }
    }

    private boolean isDigitPresent(String s) {
        char[] chars = s.toCharArray();

        for (char character : chars) {
            if (Character.isDigit(character)) {
                return true;
            }
        }
        return false;
    }

    private int getSum(long numb) {
        int sum;
        for (sum = 0; numb != 0; numb /= 10) {
            sum += numb % 10;
        }
        return sum;
    }

    private void displayFinalResult(int sum) {
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
