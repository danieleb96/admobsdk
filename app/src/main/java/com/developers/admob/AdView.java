package com.developers.admob;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

class AdView extends LinearLayout {

    public AdView(Context context) {
        super(context);
    }

    public AdView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        final TypedArray typedArray = context.obtainStyledAttributes(attrs,
                R.styleable.AdView, 0, 0);

        final int adSize = typedArray.getInt(R.styleable.AdView_adSize, AdSize.Normal);

        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        linearLayout.setBackgroundColor(Color.GRAY);
        switch (adSize) {
            case AdSize.Normal: {
                layoutParams.width = dpToPx(350);
                layoutParams.height = dpToPx(50);

                return;
            }
            case AdSize.Medium: {
                layoutParams.width = dpToPx(300);
                layoutParams.height = dpToPx(250);

                return;
            }
            case AdSize.Large: {
                layoutParams.width = dpToPx(320);
                layoutParams.height = dpToPx(100);

                return;
            }
        }
        linearLayout.setLayoutParams(layoutParams);
        typedArray.recycle();

        addView(linearLayout);
    }

    public void setAdListener(AdListener adListener) {

    }
    
    public void loadAd(AdRequest adRequest) {
    }

    public int dpToPx(int dp) {
        float density = getContext().getResources()
                .getDisplayMetrics()
                .density;

        return Math.round((float) dp * density);
    }
}