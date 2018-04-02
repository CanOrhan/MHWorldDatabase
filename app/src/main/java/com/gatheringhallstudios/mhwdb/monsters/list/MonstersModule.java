package com.gatheringhallstudios.mhwdb.monsters.list;

import com.gatheringhallstudios.DummyMonstersProvider;
import com.gatheringhallstudios.mhwdb.MonstersDataProvider;
import com.gatheringhallstudios.mhwdb.main_activity.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MonstersModule {
    @Binds
    abstract MonstersDataProvider provideMonstersDataProvider(DummyMonstersProvider monstersProvider);

    @Provides //ToDo: Inject the router instead of the activity
    static MonstersListAdapter provideMonstersListAdapter(MainActivity mainActivity) {
        return new MonstersListAdapter(mainActivity.getRouter());
    }
}
