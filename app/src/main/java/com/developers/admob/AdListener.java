package com.developers.admob;

abstract class AdListener implements AdListenerInterface {
    //
}

interface AdListenerInterface {
    void onAdLoaded();
    void onAdFailedToLoad(int errorCode);
    void onAdOpened();
    void onAdLeftApplication();
    void onAdClosed();
}
