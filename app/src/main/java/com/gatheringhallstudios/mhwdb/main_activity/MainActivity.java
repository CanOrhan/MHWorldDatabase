package com.gatheringhallstudios.mhwdb.main_activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.bluelinelabs.conductor.Conductor;
import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.gatheringhallstudios.mhwdb.R;
import com.gatheringhallstudios.mhwdb.monsters.list.MonstersListController;
import com.gatheringhallstudios.mhwdb.skills.list.SkillsController;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
    private Router router;
    private MainActivityComponent mainActivityComponent;

    @BindView(R.id.main_navigation)
    NavigationView navigationView;

    @BindView(R.id.container)
    FrameLayout content;

    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        navigationView.setItemIconTintList(null);

        mainActivityComponent = DaggerMainActivityComponent
                .builder()
                .mainActivityModule(new MainActivityModule(this))
                .build();

        router = Conductor.attachRouter(this, content, savedInstanceState);
        if (!router.hasRootController()) {
            router.setRoot(RouterTransaction.with(new SkillsController()));
        }

        setupNavigationDrawer();
    }

    private void setupNavigationDrawer() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.main_menu_skills :
                        router.setRoot(RouterTransaction.with(new SkillsController()));
                        return true;
                    case R.id.main_menu_monsters:
                        router.setRoot(RouterTransaction.with(new MonstersListController()));
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (!router.handleBack()) {
            super.onBackPressed();
        }
    }

    @NonNull
    public MainActivityComponent getMainActivityComponent() {
        return mainActivityComponent;
    }

    public Router getRouter() {
        return router;
    }
}