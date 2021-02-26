package com.my.csresources;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener;

public class BooksActivity extends AppCompatActivity {
   Button s1sub1,s1sub2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        TabLayout tablayout = findViewById(R.id.tabLayout);
        TabItem sem1 = findViewById(R.id.sem1);
        TabItem sem2 = findViewById(R.id.sem2);
        TabItem sem3 = findViewById(R.id.sem3);
        TabItem sem4 = findViewById(R.id.sem4);
        TabItem sem5 = findViewById(R.id.sem5);
        TabItem sem6 = findViewById(R.id.sem6);

        ViewPager viewPager = findViewById(R.id.viewPager);
        PagerAdapter pagerAdapter = new
                PagerAdapter(getSupportFragmentManager(),
                tablayout.getTabCount());

        viewPager.setAdapter(pagerAdapter);

        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });








    }


}