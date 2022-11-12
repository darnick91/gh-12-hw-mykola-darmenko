package task1.entity;

import task1.actives.Active;

import java.util.ArrayList;
import java.util.List;

public abstract class Customer {

    protected List<Active> actives;

    public Customer() {
        this.actives = new ArrayList<>();
    }

    public abstract int getId();
    public abstract void getCustomerInfo();

    public void addActive(Active active) {
        actives.add(active);
    }

    public double allActive() {
        double allActive = 0;
        for (Active active : actives) {
            allActive += active.activeValues();
        }
        return allActive;
    }



}
