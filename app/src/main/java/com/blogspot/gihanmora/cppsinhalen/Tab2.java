package com.blogspot.gihanmora.cppsinhalen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static com.blogspot.gihanmora.cppsinhalen.MainActivity.mInterstitialAd;

/**
 * Created by Gihan bc on 8/18/2017.
 */

public class Tab2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2, container, false);
        AdView mAdView,mAdView2;
        mAdView = (AdView)rootView.findViewById(R.id.adView4);
        mAdView2 = (AdView)rootView.findViewById(R.id.adView5);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView2.loadAd(adRequest);
        return rootView;
    }
}