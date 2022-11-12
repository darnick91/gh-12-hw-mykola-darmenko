package task1.actives;

public class CurrentDollarsAcc implements Active, ShowActive {

    private final double moneyAmount;

    public CurrentDollarsAcc(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    @Override
    public double activeValues() {
        return moneyAmount;
    }

    @Override
    public void showInfo() {
        System.out.println("Current money in this account: " + activeValues() + " dollars");
    }
}
