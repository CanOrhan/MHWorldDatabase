package com.gatheringhallstudios;

import com.gatheringhallstudios.mhwdb.Item;
import com.gatheringhallstudios.mhwdb.Monster;
import com.gatheringhallstudios.mhwdb.MonstersDataProvider;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class DummyMonstersProvider implements MonstersDataProvider{
    @javax.inject.Inject
    public DummyMonstersProvider() {
    }

    @Override
    public List<Monster> getMonsters() {
        return Collections.singletonList(new Monster("Test Monster", Arrays.asList(new Item("Part 1"), new Item("Part 2"))));
    }
}
