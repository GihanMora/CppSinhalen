package com.blogspot.gihanmora.cppsinhalen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by Gihan bc on 8/18/2017.
 */

public class Tab7 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab7, container, false);
        AdView mAdView,mAdView2,mAdView3,mAdView4;
        mAdView = (AdView)rootView.findViewById(R.id.adView21);
        mAdView2 = (AdView)rootView.findViewById(R.id.adView22);
        mAdView3 = (AdView)rootView.findViewById(R.id.adView23);
        mAdView4 = (AdView)rootView.findViewById(R.id.adView24);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView2.loadAd(adRequest);
        mAdView3.loadAd(adRequest);
        mAdView4.loadAd(adRequest);
        return rootView;
    }
}
