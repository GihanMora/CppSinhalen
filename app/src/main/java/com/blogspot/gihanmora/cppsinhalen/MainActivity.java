package com.blogspot.gihanmora.cppsinhalen;

import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import android.widget.HorizontalScrollView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.InterstitialAd;


public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;
    HorizontalScrollView sv;
//    private AdView mAdView;
    public static InterstitialAd mInterstitialAd;
    public static InterstitialAd mInterstitialAd1;

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
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this.getApplicationContext(),"ca-app-pub-5202253201958912~4166368789");
//        mAdView = (AdView)findViewById(R.id.adView);
        final AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd1 = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-5202253201958912/2282186946");
        mInterstitialAd1.setAdUnitId("ca-app-pub-5202253201958912/1469547815");
//        mInterstitialAd.loadAd(new AdRequest.Builder().build());
//        mInterstitialAd.setAdListener(new AdListener() {
//            @Override
//            public void onAdClosed() {
//                AdRequest adRequest = new AdRequest.Builder().addTestDevice("ca-app-pub-5202253201958912/2282186946").build();
//                mInterstitialAd.loadAd(adRequest);
//            }
//        });
//        if (mInterstitialAd.isLoaded()) {
//            mInterstitialAd.show();
//        } else {
//            Log.d("TAG", "The interstitial wasn't loaded yet.");
//        }

//        mAdView.loadAd(adRequest);
        //sv= (HorizontalScrollView)findViewById(R.id.sv);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        AppBarLayout app=(AppBarLayout)findViewById(R.id.appbar);
        app.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event){
                switch(event.getAction()){
                    default:
                        getSupportActionBar().show();
                }
            return false;
            }
        });


        setSupportActionBar(toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView =(NavigationView)findViewById(R.id.nevigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(MenuItem item){
                switch (item.getItemId()){
                    case R.id.tab0:
                        Intent ii=new Intent(MainActivity.this,MainActivity.class);
                        startActivity(ii);

                        mDrawerLayout.closeDrawers();
                        break;
                    case R.id.tab1:

                        Intent iii=new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(iii);

                        mDrawerLayout.closeDrawers();
//                        mInterstitialAd.loadAd(new AdRequest.Builder().build());
//                        if (mInterstitialAd.isLoaded()) {
//                            mInterstitialAd.show();
//                        } else {
//                            Log.d("TAG", "The interstitial wasn't loaded yet.");
//                        }
                        break;
                    case R.id.tab2:
                        try {
                            mInterstitialAd.loadAd(new AdRequest.Builder().build());
                            if (mInterstitialAd.isLoaded()) {
                                mInterstitialAd.show();

                            } else {
                                Log.d("TAG", "The interstitial wasn't loaded yet.");
                            }

                            Intent i = new Intent(Intent.ACTION_SEND);
                            i.setType("text/plain");
                            i.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                            String sAux = "\nC++ සිංහලෙන්\nC++  භාෂාව මුල සිට සරළව සිංහල භාශාවෙන්ම අධ්\u200Dයනය කිරීමට දැන්ම Download කරගන්න...\nDownload>>\n";
                            sAux = sAux + " https://play.google.com/store/apps/details?id=com.blogspot.gihanmora.cppsinhalen\n\n";
                            i.putExtra(Intent.EXTRA_TEXT, sAux);
                            startActivity(Intent.createChooser(i, "Choose One"));
                        } catch(Exception e) {
                            //e.toString();
                        }
                        mDrawerLayout.closeDrawers();
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                        } else {
                            Log.d("TAG", "The interstitial wasn't loaded yet.");
                        }
                        break;
                    case R.id.tab3:
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                        } else {
                            Log.d("TAG", "The interstitial wasn't loaded yet.");
                        }
                        System.exit(0);
                        break;

                    //case R.id.tab22:
                     //   Intent ii3=new Intent(MainActivity.this,Main3Activity.class);
                    //    startActivity(ii3);

                     //   mDrawerLayout.closeDrawers();
                     //   break;





                }
                return false;
            }

        });



        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);


        tabLayout.setupWithViewPager(mViewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);


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
    public static class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        AdRequest adRequest1 = new AdRequest.Builder().build();
        @Override
        public Fragment getItem(int position) {
            switch(position){
                case 0:
                    Tab1 tb1 =new Tab1();

                    return tb1;

                case 1:

                    mInterstitialAd.loadAd(adRequest1);
                    if (mInterstitialAd.isLoaded()) {

                        mInterstitialAd.show();
                        Log.d("TAG", "ad 0 showed");
                    } else {
                        Log.d("TAG", "The interstitial ad wasn't loaded yet. 1");
                    }
                    Tab2 tb2 =new Tab2();

                    return tb2;
                case 2:
                    Log.d("TAG", "no ads 2");
                    Tab3 tb3 =new Tab3();
                    return tb3;
                case 3:
                    mInterstitialAd.loadAd(adRequest1);
                    if (mInterstitialAd1.isLoaded()) {
                        mInterstitialAd1.show();
                        Log.d("TAG", "ad 1 showed");
                    } else {
                        Log.d("TAG", "The interstitial ad1 wasn't loaded yet.");
                    }

                    Tab4 tb4 =new Tab4();
                    return tb4;
                case 4:

                    Tab5 tb5 =new Tab5();
                    return tb5;
                case 5:
                    mInterstitialAd.loadAd(adRequest1);
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }

                    Tab6 tb6 =new Tab6();
                    return tb6;
                case 6:
                    mInterstitialAd.loadAd(adRequest1);
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                    Tab7 tb7 =new Tab7();
                    return tb7;
                case 7:
                    mInterstitialAd.loadAd(adRequest1);
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
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
