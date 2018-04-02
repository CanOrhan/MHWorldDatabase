package com.gatheringhallstudios.mhwdb.monsters;

import com.gatheringhallstudios.mhwdb.monsters.list.MonstersListController;
import com.gatheringhallstudios.mhwdb.monsters.list.MonstersModule;

import dagger.Subcomponent;

@Subcomponent(modules = MonstersModule.class)
public interface MonstersComponent {
    @Subcomponent.Builder
    interface Builder {
        MonstersComponent build();
    }

    void inject(MonstersListController monstersListController);
}
