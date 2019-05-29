package com.example.yearbook;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

class FragmentClassAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;

    public FragmentClassAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int i) {

        return this.fragments.get(i);
    }

    @Override
    public int getCount() {

        return this.fragments.size();
    }

    @Override
    public int getItemPosition(@NonNull Object object) {

        return super.getItemPosition(object);
    }
}
