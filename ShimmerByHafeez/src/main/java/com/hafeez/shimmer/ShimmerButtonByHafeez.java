package com.hafeez.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.facebook.shimmer.Shimmer;
import com.facebook.shimmer.ShimmerFrameLayout;

public class ShimmerButtonByHafeez extends RelativeLayout {
    private ShimmerFrameLayout shimmerFrameLayout;
    private Button buttonB;
    private Button buttonF;

    public ShimmerButtonByHafeez(Context context) {
        this(context, null);
    }

    public ShimmerButtonByHafeez(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ShimmerButtonByHafeez(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        LayoutInflater.from(context).inflate(R.layout.layout_shimmer_button, this, true);
        shimmerFrameLayout = findViewById(R.id.shimmer_view_container1);
        buttonB = findViewById(R.id.buttonB);
        buttonF = findViewById(R.id.buttonF);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ShimmerButtonByHafeez);
        int shimmerSpeed = a.getInt(R.styleable.ShimmerButtonByHafeez_shimmer_speed, 2000);
        int shimmerBackgroundRes = a.getResourceId(R.styleable.ShimmerButtonByHafeez_shimmer_bg_res, R.drawable.blue_gradient_round_bg);
        int shimmerForegroundRes = a.getResourceId(R.styleable.ShimmerButtonByHafeez_shimmer_foreground_res, R.drawable.white_round_bg);

        // Read additional attributes...
        CharSequence buttonText = a.getText(R.styleable.ShimmerButtonByHafeez_android_text);
        boolean textAllCaps = a.getBoolean(R.styleable.ShimmerButtonByHafeez_android_textAllCaps, true);
        int textColor = a.getColor(R.styleable.ShimmerButtonByHafeez_android_textColor, getResources().getColor(R.color.white));
        float textSize = a.getDimension(R.styleable.ShimmerButtonByHafeez_android_textSize, getResources().getDimension(R.dimen.default_text_size));
        a.recycle();

        Shimmer.Builder shimmerBuilder = new Shimmer.AlphaHighlightBuilder();
        shimmerBuilder.setDuration(shimmerSpeed); // Set shimmer duration here

        shimmerFrameLayout.setShimmer(shimmerBuilder.build());
        buttonB.setBackgroundResource(shimmerBackgroundRes);
        buttonF.setBackgroundResource(shimmerForegroundRes);

        // Set additional attributes
        buttonB.setText(buttonText);
        buttonB.setAllCaps(textAllCaps);
        buttonB.setTextColor(textColor);
        buttonB.setTextSize(textSize);
    }

    public void setShimmerSpeed(int speed) {
        Shimmer.Builder shimmerBuilder = new Shimmer.AlphaHighlightBuilder();
        shimmerBuilder.setDuration(speed);
        shimmerFrameLayout.setShimmer(shimmerBuilder.build());
    }

    public void setShimmerBackgroundRes(int resId) {
        buttonB.setBackgroundResource(resId);
    }

    public void setShimmerForegroundRes(int resId) {
        buttonF.setBackgroundResource(resId);
    }

    // Additional methods to set text attributes
    public void setText(CharSequence text) {
        buttonB.setText(text);
    }

    public void setTextAllCaps(boolean allCaps) {
        buttonB.setAllCaps(allCaps);
    }

    public void setTextColor(int color) {
        buttonB.setTextColor(color);
    }

    public void setTextSize(float size) {
        buttonB.setTextSize(size);
    }
}