package task1.actives;

public enum Currency {
    USD("Dollar"),
    EUR("Euro");

    private final String type;

    Currency(String type) {
        this.type = type;
    }

    public String getCurrency() {
        return type;
    }
}
