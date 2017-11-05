package com.gatheringhallstudios.mhwdb.main_activity;

import dagger.Module;
import dagger.Provides;

@Module
class MainActivityModule {
    private final MainActivity mainActivity;

    MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    MainActivity provideMainActivity() {
        return mainActivity;
    }
}
