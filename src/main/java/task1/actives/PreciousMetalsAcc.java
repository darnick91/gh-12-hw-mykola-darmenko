package task1.actives;

import static task1.actives.TypeOfMetal.PLATINUM;
import static task1.actives.TypeOfMetal.SILVER;

public class PreciousMetalsAcc implements Active, ShowActive {

    private final String typeOfMetal;
    private final double massInKg;

    public PreciousMetalsAcc(String typeOfMetal, double massInKg) {
        this.typeOfMetal = typeOfMetal;
        this.massInKg = massInKg;
    }

    public static String getTypeOfMetal(String typeOfMetal) {
        if (typeOfMetal.equals(TypeOfMetal.GOLD.getType()))
            return typeOfMetal;
        else if (typeOfMetal.equals(SILVER.getType()))
            return typeOfMetal;
        else if (typeOfMetal.equals(PLATINUM.getType()))
            return typeOfMetal;
        else return null;
    }

    @Override
    public double activeValues() {
        switch (typeOfMetal) {
            case "Gold":
                return massInKg * 53769.8;
            case "Silver":
                return massInKg * 689.8;
            case "Platinum":
                return massInKg * 32151;
            default:
                return 0;
        }
    }

    @Override
    public void showInfo() {
        System.out.println("Precious Metal converted to dollars: " + activeValues());
    }
}
