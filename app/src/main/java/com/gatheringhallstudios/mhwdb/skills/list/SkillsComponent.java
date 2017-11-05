package com.gatheringhallstudios.mhwdb.skills.list;

import dagger.Subcomponent;

@Subcomponent(modules = SkillsModule.class)
public interface SkillsComponent {
    @Subcomponent.Builder
    interface Builder {
        SkillsComponent build();
    }

    void inject(SkillsController skillsController);
}
