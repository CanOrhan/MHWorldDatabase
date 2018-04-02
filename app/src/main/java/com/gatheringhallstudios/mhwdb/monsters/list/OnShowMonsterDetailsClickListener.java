package com.gatheringhallstudios.mhwdb.monsters.list;

import android.view.View;

import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.bluelinelabs.conductor.changehandler.SimpleSwapChangeHandler;
import com.gatheringhallstudios.mhwdb.monsters.details.MonsterDetailsController;

import javax.inject.Inject;

/**
 * ToDo: Explain the scope of this class
 */

public class OnShowMonsterDetailsClickListener implements View.OnClickListener {

    private final Router router;

    @Inject
    public OnShowMonsterDetailsClickListener(Router router) {
        this.router = router;
    }

    @Override
    public void onClick(View v) {
        router.pushController(RouterTransaction.with(new MonsterDetailsController())
                .pushChangeHandler(new SimpleSwapChangeHandler())
                .popChangeHandler(new SimpleSwapChangeHandler())
                .tag("MonsterDetail")
        );
    }
}
