package com.gatheringhallstudios.mhwdb.skills.list;

import android.view.View;

import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.bluelinelabs.conductor.changehandler.SimpleSwapChangeHandler;
import com.gatheringhallstudios.mhwdb.skills.details.SkillDetailsController;

import javax.inject.Inject;


class OnShowSkillClickListener implements View.OnClickListener {

    private final Router router;

    @Inject
    public OnShowSkillClickListener(Router router) {
        this.router = router;
    }

    @Override
    public void onClick(View view) {
        router.pushController(RouterTransaction.with(new SkillDetailsController())
                .pushChangeHandler(new SimpleSwapChangeHandler())
                .popChangeHandler(new SimpleSwapChangeHandler())
                .tag("SkillNav")
        );
    }
}
