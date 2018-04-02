package com.gatheringhallstudios.mhwdb.monsters.list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.gatheringhallstudios.mhwdb.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * ToDo: Explain the scope of this class
 */

public class MonstersViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.root)
    public TextView textView;

    public MonstersViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
