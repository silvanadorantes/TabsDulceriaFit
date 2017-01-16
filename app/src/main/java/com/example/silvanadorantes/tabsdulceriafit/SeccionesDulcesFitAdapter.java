package com.example.silvanadorantes.tabsdulceriafit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silvana on 05/07/16.
 */
public class SeccionesDulcesFitAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> fragments = new ArrayList<>();
    private final List<String> titleFragments = new ArrayList<>();

    public SeccionesDulcesFitAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    public void addFragments(Fragment fragment, String title){
        fragments.add(fragment);
        titleFragments.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleFragments.get(position);
    }
}
