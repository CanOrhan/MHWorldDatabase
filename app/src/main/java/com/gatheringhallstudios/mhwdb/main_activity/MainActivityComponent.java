package com.gatheringhallstudios.mhwdb.main_activity;

import com.gatheringhallstudios.mhwdb.monsters.MonstersComponent;
import com.gatheringhallstudios.mhwdb.skills.list.SkillsComponent;

import dagger.Component;

@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    SkillsComponent.Builder skillsComponentBuilder();
    MonstersComponent.Builder monstersComponentBuilder();
}
