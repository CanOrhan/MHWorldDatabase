package com.gatheringhallstudios.mhwdb;

import java.util.List;
import java.util.Map;

public class Skill {
    private final String name;
    private final Map<Integer, List<StatBoost>> levels;

    public Skill(String name, Map<Integer, List<StatBoost>> levels) {
        this.name = name;
        this.levels = levels;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, List<StatBoost>> getLevels() {
        return levels;
    }
}
