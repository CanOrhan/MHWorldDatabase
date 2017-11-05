package com.gatheringhallstudios.mhwdb;


public class StatBoost {
    private final String name;
    private final double value;

    public StatBoost(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
