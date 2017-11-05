package com.gatheringhallstudios.mhwdb.skills.list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.gatheringhallstudios.mhwdb.R;

import butterknife.BindView;
import butterknife.ButterKnife;


class SkillViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.skill_name)
    TextView skillName;

    SkillViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    TextView getSkillName() {
        return skillName;
    }
}
