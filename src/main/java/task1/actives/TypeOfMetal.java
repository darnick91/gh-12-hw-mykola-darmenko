package task1.actives;

public enum TypeOfMetal {
    GOLD("Gold"),
    SILVER("Silver"),
    PLATINUM("Platinum");

    private final String type;

    TypeOfMetal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
