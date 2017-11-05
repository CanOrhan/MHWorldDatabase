package com.gatheringhallstudios.mhwdb.skills.details;


import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;
import com.gatheringhallstudios.mhwdb.R;

public class SkillDetailsController extends Controller {

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        return inflater.inflate(R.layout.fragment_skill_details, container, false);
    }
}
