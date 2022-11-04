package org.geekhub.mykola;

public class PrintSumOfPhoneNumberDigits {

    public PrintSumOfPhoneNumberDigits() {
    }

    public static void printSum(String line) {
        long numb = Long.parseLong(line.trim());
        boolean isFinished = true;
        int i = 0;
        while (isFinished) {
            int sum = getSum(numb);
            numb = sum;
            displayCalculationResult(i + 1, sum);
            if (sum > 0 && sum < 10) {
                isFinished = false;
                displayFinalResult(sum);
            }
            i++;
        }
    }

    private static void displayCalculationResult(int i, int sum) {
        switch (i) {
            case 1:
                System.out.println(i + OrdinalNumbers.ST.getTitle() + " round of calculation, sum is: " + sum);
                break;
            case 2:
                System.out.println(i + OrdinalNumbers.ND.getTitle() + " round of calculation, sum is: " + sum);
                break;
            case 3:
                System.out.println(i + OrdinalNumbers.RD.getTitle() + " round of calculation, sum is: " + sum);
                break;
            case 4:
                System.out.println(i + OrdinalNumbers.TH.getTitle() + " round of calculation, sum is: " + sum);
                break;
        }
    }

    private static int getSum(long numb) {
        int sum;
        for (sum = 0; numb != 0; numb /= 10) {
            sum += numb % 10;
        }
        return sum;
    }

    private static void displayFinalResult(int sum) {
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
