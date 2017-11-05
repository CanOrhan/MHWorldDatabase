package com.gatheringhallstudios.mhwdb.skills.list;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Router;
import com.gatheringhallstudios.mhwdb.R;
import com.gatheringhallstudios.mhwdb.Skill;

import java.util.List;

import javax.inject.Inject;


class SkillsListAdapter extends RecyclerView.Adapter<SkillViewHolder> {
    private List<Skill> skills;
    private final Router router;

    @Inject
    public SkillsListAdapter(Router router) {
        this.router = router;
    }

    @Override
    public SkillViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_skill, parent, false);
        SkillViewHolder viewHolder = new SkillViewHolder(view);
        viewHolder.getSkillName().setOnClickListener(new OnShowSkillClickListener(router));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(SkillViewHolder holder, int position) {
        holder.getSkillName().setText(skills.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return skills.size();
    }

    public void setData(List<Skill> skills) {
        if (this.skills == null) {
           this.skills = skills;
        } else {
            this.skills.clear();
            this.skills.addAll(skills);
            notifyItemRangeInserted(0, skills.size());
        }
    }
}
