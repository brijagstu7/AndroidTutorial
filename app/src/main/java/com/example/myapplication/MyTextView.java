package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;

@SuppressLint("AppCompatCustomView")
public class MyTextView extends TextView {
    public MyTextView(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);

    }
}
