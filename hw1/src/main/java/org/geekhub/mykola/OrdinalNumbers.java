package org.geekhub.mykola;

public enum OrdinalNumbers {
    ST("st"),
    ND("nd"),
    RD("rd"),
    TH("th");

    private final String title;

    OrdinalNumbers(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
