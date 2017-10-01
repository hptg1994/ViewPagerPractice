package edu.stevens.hptg.viewpagerpractice;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new NumberPagerAdapter(getSupportFragmentManager()));

        // One  More step to add the TabView
        TabLayout tabLayout = (TabLayout) findViewById(R.id.view_pager_tab);
        tabLayout.setupWithViewPager(viewPager);
    }

    private class NumberPagerAdapter extends FragmentPagerAdapter{

        public NumberPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return PageFragment.newInstance(position);
        }

        @Override
        public int getCount() {
            return 5;
        }

        //还有这里是把文字添加到TabView上面的
        @Override
        public CharSequence getPageTitle(int position) {
            return "Page"  + position;
        }
    }
}
