package com.gatheringhallstudios.mhwdb;

import java.util.List;

/**
 * ToDo: Explain the scope of this class
 */

public class Weapon {
    private final String name;
    private final List<Item> itemsToCraft;

    public Weapon(String name, List<Item> itemsToCraft) {
        this.name = name;
        this.itemsToCraft = itemsToCraft;
    }
}
