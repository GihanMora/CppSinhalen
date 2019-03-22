package com.blogspot.gihanmora.cppsinhalen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import static com.blogspot.gihanmora.cppsinhalen.MainActivity.mInterstitialAd;

/**
 * Created by Gihan bc on 8/18/2017.
 */

public class Tab1  extends Fragment  {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1, container, false);
        AdView mAdView,mAdView2,mAdView3;
        mAdView = (AdView)rootView.findViewById(R.id.adView1);
        mAdView2 = (AdView)rootView.findViewById(R.id.adView2);
        mAdView3 = (AdView)rootView.findViewById(R.id.adView3);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView2.loadAd(adRequest);
        mAdView3.loadAd(adRequest);

        return rootView;
    }

}
