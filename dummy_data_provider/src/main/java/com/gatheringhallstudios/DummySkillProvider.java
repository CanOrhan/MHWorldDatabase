package com.gatheringhallstudios;

import com.gatheringhallstudios.mhwdb.Skill;
import com.gatheringhallstudios.mhwdb.SkillDataProvider;
import com.gatheringhallstudios.mhwdb.StatBoost;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DummySkillProvider implements SkillDataProvider {
    @javax.inject.Inject
    DummySkillProvider() {}

    @Override
    public List<Skill> getSkills() {
        HashMap<Integer, List<StatBoost>> skillLevels = new HashMap<>();
        List<StatBoost> attackLevelOne = new ArrayList<>();
        attackLevelOne.add(new StatBoost("Attack", 3));

        List<StatBoost> attackLevelTwo = new ArrayList<>();
        attackLevelTwo.add(new StatBoost("Attack", 6));

        List<StatBoost> attackLevelThree = new ArrayList<>();
        attackLevelThree.add(new StatBoost("Attack", 9));

        List<StatBoost> attackLevelFour = new ArrayList<>();
        attackLevelFour.add(new StatBoost("Attack", 12));
        attackLevelFour.add(new StatBoost("Affinity", 0.05));

        List<StatBoost> attackLevelFive = new ArrayList<>();
        attackLevelFive.add(new StatBoost("Attack", 15));
        attackLevelFive.add(new StatBoost("Affinity", 0.05));

        List<StatBoost> attackLevelSix = new ArrayList<>();
        attackLevelSix.add(new StatBoost("Attack", 18));
        attackLevelSix.add(new StatBoost("Affinity", 0.05));

        List<StatBoost> attackLevelSeven = new ArrayList<>();
        attackLevelSeven.add(new StatBoost("Attack", 21));
        attackLevelSeven.add(new StatBoost("Affinity", 0.05));

        skillLevels.put(1, attackLevelOne);
        skillLevels.put(2, attackLevelTwo);
        skillLevels.put(3, attackLevelThree);
        skillLevels.put(4, attackLevelFour);
        skillLevels.put(5, attackLevelFive);
        skillLevels.put(6, attackLevelSix);
        skillLevels.put(7, attackLevelSeven);

        Skill skill = new Skill("Attack Boost", skillLevels);
        return Collections.singletonList(skill);
    }


}
