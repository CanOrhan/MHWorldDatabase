package com.gatheringhallstudios.mhwdb.skills.list;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;
import com.gatheringhallstudios.mhwdb.R;
import com.gatheringhallstudios.mhwdb.SkillDataProvider;
import com.gatheringhallstudios.mhwdb.main_activity.MainActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SkillsController extends Controller {
    @BindView(R.id.skill_list)
    RecyclerView skillList;

    @Inject
    SkillDataProvider skillDataProvider;

    @Inject
    SkillsListAdapter skillsListAdapter;

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        injectThings();

        View view = inflater.inflate(R.layout.fragment_skills, container, false);
        ButterKnife.bind(this, view);
        skillList.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));

        initView();

        return view;
    }

    private void injectThings() {
        MainActivity mainActivity = (MainActivity) getActivity();
        mainActivity.getMainActivityComponent()
                .skillsComponentBuilder()
                .build()
                .inject(this);
    }

    private void initView() {
        skillList.setAdapter(skillsListAdapter);
        skillsListAdapter.setData(skillDataProvider.getSkills());
    }
}
