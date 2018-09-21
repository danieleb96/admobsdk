package com.developers.admob;

import android.app.Dialog;
import android.content.Context;

class InterstitialAd {

    private Context context;

    InterstitialAd(Context context) {
        this.context = context;
    }

    public void setAdUnitId(String adUnitId) {

    }

    public void loadAd(AdRequest build) {
    }

    public boolean isLoaded() {
        return true;
    }

    public void show() {
        Dialog dialog = new Dialog(this.context,
                android.R.style.Theme_Black_NoTitleBar_Fullscreen);

        dialog.show();
    }
}
