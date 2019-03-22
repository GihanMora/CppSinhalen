package com.blogspot.gihanmora.cppsinhalen;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Main2Activity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private AdView mAdView;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MobileAds.initialize(this.getApplicationContext(),"ca-app-pub-5202253201958912~4166368789");
        mAdView = (AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();

        mAdView.loadAd(adRequest);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        navigationView =(NavigationView)findViewById(R.id.nevigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(MenuItem item){
                switch (item.getItemId()){
                    case R.id.tab0:
                        Intent ii=new Intent(Main2Activity.this,MainActivity.class);
                        startActivity(ii);

                        mDrawerLayout.closeDrawers();
                        break;
                    case R.id.tab1:
                        Intent iii=new Intent(Main2Activity.this,Main2Activity.class);
                        startActivity(iii);

                        mDrawerLayout.closeDrawers();
                        break;
                    case R.id.tab2:
                        try {
                            Intent i = new Intent(Intent.ACTION_SEND);
                            i.setType("text/plain");
                            i.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                            String sAux = "\nStay tuned with us\nfor new Srilankan\nandroid applications\nතෙරුවණ් සරණයි..";
                            sAux = sAux + "\nhttps:www.gihanmora.blogspot.com\n\nFacebook:https://web.facebook.com/Srilankan-Android-Apps-1073835039338489 \n\n";
                            i.putExtra(Intent.EXTRA_TEXT, sAux);
                            startActivity(Intent.createChooser(i, "Choose One"));
                        } catch(Exception e) {
                            //e.toString();
                        }
                        mDrawerLayout.closeDrawers();
                        break;
                    case R.id.tab3:
                        System.exit(0);
                        break;
                    //case R.id.tab22:
                    //    Intent ii3=new Intent(Main2Activity.this,Main3Activity.class);
                     //   startActivity(ii3);

                   //     mDrawerLayout.closeDrawers();
                     //   break;





                }
                return false;
            }

        });
    }
}
