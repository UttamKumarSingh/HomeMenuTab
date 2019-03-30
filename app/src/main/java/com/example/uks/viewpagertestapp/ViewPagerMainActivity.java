package com.example.uks.viewpagertestapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewPagerMainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private FragmentPageAdaptor fragmentPageAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_main);
        viewPager = findViewById(R.id.pager);
        fragmentPageAdaptor = new FragmentPageAdaptor(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPageAdaptor);
    }
}
