package com.example.amandamoore14.tabs;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import static com.example.amandamoore14.tabs.R.layout.activity_main;


public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    MyPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        MyPagerAdapter fragmentAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.viewpager_main);
        tabLayout = (TabLayout) findViewById(R.id.tabs_main);
        tabLayout.setUpWithViewPager(viewpager_main);

    }
}
