package com.gatheringhallstudios.mhwdb.main_activity;

import com.bluelinelabs.conductor.Router;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
@Singleton
class RouterModule {
    private final Router router;

    public RouterModule (Router router) {
        this.router = router;
    }

    @Provides
    Router provideRouter() {
        return router;
    }
}
