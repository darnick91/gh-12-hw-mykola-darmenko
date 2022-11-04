package org.geekhub.mykola;

import static java.util.Objects.isNull;

public class PhoneNumberValidator {

    private static final String[] operatorCodes = {"063", "066", "067", "068", "093", "095", "096", "097", "098"};
    private static final String[] countryCodes = {"38", "8", "0038",};

    private PhoneNumberValidator() {
    }

    public static boolean isValid(String phoneNumber) {
        if (isNull(phoneNumber) || phoneNumber.isEmpty()) {
            return false;
        }

        phoneNumber = processPlus(phoneNumber);

        if (!(hasNotSpecialSymbols(phoneNumber))) {
         return false;
        }

        phoneNumber = processCountryCode(phoneNumber);

        return isValidLength(phoneNumber) && hasOperatorCode(phoneNumber);
    }

    private static String processPlus(String phoneNumber) {
        if (phoneNumber.startsWith("+")) {
            phoneNumber = phoneNumber.substring(1);
        }
        return phoneNumber;
    }

    private static boolean hasNotSpecialSymbols(String phoneNumber) {
        final char[] symbols = phoneNumber.toCharArray();
        for (char symbol : symbols) {
            final boolean digit = Character.isDigit(symbol);
            if (!digit) {
                return false;
            }
        }
        return true;
    }

    private static String processCountryCode(String phoneNumber) {
        for (String countryCode : countryCodes) {
            if (phoneNumber.startsWith(countryCode)) {
                return phoneNumber.substring(countryCode.length());
            }
        }
        return phoneNumber;
    }

    private static boolean isValidLength(String phoneNumber) {
        return phoneNumber.length() == 10;
    }

    private static boolean hasOperatorCode(String phoneNumber) {
        for (String operatorCode : operatorCodes) {
            if (phoneNumber.startsWith(operatorCode)) {
                return true;
            }
        }
        return false;
    }
}