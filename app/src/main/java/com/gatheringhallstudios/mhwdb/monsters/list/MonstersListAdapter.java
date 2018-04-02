package com.gatheringhallstudios.mhwdb.monsters.list;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Router;
import com.gatheringhallstudios.mhwdb.Monster;
import com.gatheringhallstudios.mhwdb.R;

import java.util.ArrayList;
import java.util.List;

/**
 * ToDo: Explain the scope of this class
 */

public class MonstersListAdapter extends RecyclerView.Adapter<MonstersViewHolder> {
    private final Router router;
    private List<Monster> monsters = new ArrayList<>();

    public MonstersListAdapter(Router router) {
        this.router = router;
    }

    @Override
    public MonstersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.viewholder_monster, parent, false);
        return new MonstersViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MonstersViewHolder holder, int position) {
        holder.textView.setText(monsters.get(position).getName());
        holder.textView.setOnClickListener(new OnShowMonsterDetailsClickListener(router));
    }

    @Override
    public int getItemCount() {
        return monsters.size();
    }

    public void setData(List<Monster> monsters) {
        if (this.monsters == null) {
            this.monsters = monsters;
        } else {
            this.monsters.clear();
            this.monsters.addAll(monsters);
            notifyItemRangeInserted(0, monsters.size());
        }
    }
}
