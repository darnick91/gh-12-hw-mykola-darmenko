package task1.actives;

import java.time.LocalDate;

import static task1.actives.Currency.EUR;
import static task1.actives.Currency.USD;

public class DepositAcc implements Active, ShowActive {

    private final String currency;
    private final LocalDate startDate;
    private final double moneyAmount;
    private final double yearPercent;

    public DepositAcc(String currency, LocalDate startDate, double moneyAmount, double yearPercent) {
        this.currency = currency;
        this.startDate = startDate;
        this.moneyAmount = moneyAmount;
        this.yearPercent = yearPercent;
    }

    public static double getYearPercent() {
        return 0.1;
    }

    public static String getCurrency(String typeOfCurrency) {
        if (typeOfCurrency.equals(USD.getCurrency()))
            return typeOfCurrency;
        else if (typeOfCurrency.equals(EUR.getCurrency()))
            return typeOfCurrency;
        else return null;
    }

    @Override
    public double activeValues() {
        if (getYearsAmount(startDate) != 0) {
            return moneyAmount + moneyAmount * yearPercent * getYearsAmount(startDate);
        } else return moneyAmount;
    }

    @Override
    public void showInfo() {
        System.out.println("Deposit account for 1 year in dollars is: " + activeValues());
    }

    private double getYearsAmount(LocalDate startDate) {
        double temp = startDate.getYear();
        return startDate.plusYears(1).getYear() == temp ? 1 : 0;
    }
}
