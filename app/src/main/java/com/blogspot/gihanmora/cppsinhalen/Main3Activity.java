package com.blogspot.gihanmora.cppsinhalen;

import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Main3Activity extends AppCompatActivity {
    private MainActivity.SectionsPagerAdapter mSectionsPagerAdapter;
    HorizontalScrollView sv;
    private AdView mAdView;
    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    NavigationView navigationView;

    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position){
                case 0:
                    Tab1 tb1 =new Tab1();

                    return tb1;
                case 1:
                    Tab2 tb2 =new Tab2();

                    return tb2;
                case 2:
                    Tab3 tb3 =new Tab3();

                    return tb3;
                case 3:
                    Tab4 tb4 =new Tab4();
                    return tb4;
                case 4:
                    Tab5 tb5 =new Tab5();
                    return tb5;
                case 5:
                    Tab6 tb6 =new Tab6();
                    return tb6;
                case 6:
                    Tab7 tb7 =new Tab7();
                    return tb7;
                case 7:
                    Tab8 tb8 =new Tab8();
                    return tb8;

                default:
                    return null;

            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 8;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "මොකක්ද C++ කියන්නෙ?";
                case 1:
                    return "මූලික කරුණු";
                case 2:
                    return "C++ වල Variables";
                case 3:
                    return "C++ වල Operators";
                case 4:
                    return "Conditional Statements";
                case 5:
                    return "Loops";
                case 6:
                    return "Functions";
                case 7:
                    return "Arrays";


            }
            return null;
        }
    }
}
