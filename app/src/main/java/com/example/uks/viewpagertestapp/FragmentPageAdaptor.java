package com.example.uks.viewpagertestapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class FragmentPageAdaptor extends FragmentStatePagerAdapter{
    FragmentPageAdaptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        FragmentForPager fragmentForPager = new FragmentForPager();
        Bundle bundle = new Bundle();
        position++;
        bundle.putString("message","Hello from page:"+position);
        fragmentForPager.setArguments(bundle);
        return fragmentForPager;
    }

    @Override
    public int getCount() {
        return Constants.PAGE_RETURN_TYPE;
    }
}
