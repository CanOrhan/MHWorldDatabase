package com.gatheringhallstudios.mhwdb.skills.list;

import com.gatheringhallstudios.DummySkillProvider;
import com.gatheringhallstudios.mhwdb.SkillDataProvider;
import com.gatheringhallstudios.mhwdb.main_activity.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class SkillsModule {

    @Provides
    static SkillsListAdapter provideSkillsListAdapter(MainActivity mainActivity) {
        return new SkillsListAdapter(mainActivity.getRouter());
    }

    @Binds
    abstract SkillDataProvider bindSkillDataProvider(DummySkillProvider dummySkillProvider);
}
