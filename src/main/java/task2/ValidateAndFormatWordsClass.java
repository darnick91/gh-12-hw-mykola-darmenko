package task2;

public class ValidateAndFormatWordsClass {

    protected static boolean validateWords(String word) {
        return word.length() >= 1 && word.length() <= 100;
    }

    protected static String formatWords(String word) {
        if (word.length() > 10) {
            int numberOfLetters = word.length() - 2;
            word = word.charAt(0) + String.valueOf(numberOfLetters) + word.charAt(word.length() - 1);
        }
        return word.toLowerCase();
    }
}
