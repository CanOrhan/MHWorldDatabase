package com.gatheringhallstudios.mhwdb.items;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.RouterTransaction;
import com.bluelinelabs.conductor.changehandler.SimpleSwapChangeHandler;
import com.gatheringhallstudios.mhwdb.R;
import com.gatheringhallstudios.mhwdb.main_activity.MainActivity;
import com.gatheringhallstudios.mhwdb.monsters.details.MonsterDetailsController;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Contains a list of monsters that this item can be found on
 */

public class ItemDetailsController extends Controller {
    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View v = inflater.inflate(R.layout.fragment_item_details, container, false);
        ButterKnife.bind(this, v);
        return v;
    }

    @OnClick(R.id.monster_part)
    public void onClick() {
        ((MainActivity) getActivity()).getRouter()
                .pushController(RouterTransaction.with(new MonsterDetailsController())
                        .pushChangeHandler(new SimpleSwapChangeHandler())
                        .popChangeHandler(new SimpleSwapChangeHandler())
                        .tag("Item"));
    }
}