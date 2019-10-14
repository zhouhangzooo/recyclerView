package com.example.mahadi.frgmtandrcycle;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter viewPageAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout_id);
        viewPager = (ViewPager) findViewById(R.id.pageViewId);

        viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager());

   //     Add Fragment
        viewPageAdapter.AddFrmt(new OngoingFragment(),"");
        viewPageAdapter.AddFrmt(new FinishFragment(),"");

        viewPager.setAdapter(viewPageAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);

        tabLayout.getTabAt(0).setText("进行中");//setIcon(R.drawable.ic_call_black_24dp);
        tabLayout.getTabAt(1).setText("已完成");

        //Remove ActionBar Shadow

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
    }
}
