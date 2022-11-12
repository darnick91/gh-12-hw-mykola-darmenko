package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static task2.ValidateAndFormatWordsClass.formatWords;
import static task2.ValidateAndFormatWordsClass.validateWords;

public class App {
    public static void main(String[] args) {

        List<String> wordsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the count of words: ");

        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String word = scanner.nextLine();
            if (validateWords(word)) {
                wordsList.add(formatWords(word));
            }
        }

        for (String result : wordsList) {
            System.out.println(result);
        }
    }
}
