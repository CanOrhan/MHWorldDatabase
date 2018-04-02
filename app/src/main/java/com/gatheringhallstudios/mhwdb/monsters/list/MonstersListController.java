package com.gatheringhallstudios.mhwdb.monsters.list;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;
import com.gatheringhallstudios.mhwdb.MonstersDataProvider;
import com.gatheringhallstudios.mhwdb.R;
import com.gatheringhallstudios.mhwdb.SkillDataProvider;
import com.gatheringhallstudios.mhwdb.main_activity.MainActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MonstersListController extends Controller {
    @BindView(R.id.monsters_list)
    RecyclerView monstersList;

    @Inject
    MonstersDataProvider monstersDataProvider;

    @Inject
    MonstersListAdapter monstersListAdapter;

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        injectThings();
        View v = inflater.inflate(R.layout.fragment_monsters_list, container, false);
        ButterKnife.bind(this, v);

        initView();
        return v;
    }

    private void injectThings() {
        MainActivity mainActivity = (MainActivity) getActivity();
        mainActivity.getMainActivityComponent()
                .monstersComponentBuilder()
                .build()
                .inject(this);
    }

    private void initView() {
        monstersList.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        monstersList.setAdapter(monstersListAdapter);
        monstersListAdapter.setData(monstersDataProvider.getMonsters());
    }
}
