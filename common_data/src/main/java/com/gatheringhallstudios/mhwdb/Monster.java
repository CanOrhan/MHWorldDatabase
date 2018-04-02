package com.gatheringhallstudios.mhwdb;

import java.util.List;

/**
 * ToDo: Explain the scope of this class
 */

public class Monster {
    private final String name;
    private final List<Item> drops;

    public Monster(String name, List<Item> drops) {
        this.name = name;
        this.drops = drops;
    }

    public String getName() {
        return name;
    }

    public List<Item> getDrops() {
        return drops;
    }
}
