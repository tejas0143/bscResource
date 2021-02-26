package com.my.csresources;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import fragments.Sem1Fragment;
import fragments.Sem2Fragment;
import fragments.Sem3Fragment;
import fragments.Sem4Fragment;
import fragments.Sem5Fragment;
import fragments.Sem6Fragment;

public class PagerAdapter extends FragmentPagerAdapter {
    private int numOfTabs;
    public PagerAdapter(FragmentManager fm,int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
     switch (position){
         case 0:
             return  new Sem1Fragment();
         case 1:
             return  new Sem2Fragment();
         case 2:
             return  new Sem3Fragment();
         case 3:
             return  new Sem4Fragment();
         case 4:
             return  new Sem5Fragment();
         case 5:
             return  new Sem6Fragment();
         default:
             return null;
     }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
