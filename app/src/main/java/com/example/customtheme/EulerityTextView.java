package com.example.customtheme;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

public class EulerityTextView extends androidx.appcompat.widget.AppCompatTextView {

    public EulerityTextView(Context context) {
        super(context);
    }

    public EulerityTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        if (attrs != null) {

            TypedArray a = context.getTheme().obtainStyledAttributes(
                    attrs,
                    R.styleable.EulerityTextView,
                    0, 0);

            try {
                String backgroundColorType = a.getString(R.styleable.EulerityTextView_eulerityBackgroundColor);
                String textColorType = a.getString(R.styleable.EulerityTextView_eulerityTextColor);
                String backgroundHexColor = DataManager.colorSet.get(backgroundColorType);
                String textHexColor = DataManager.colorSet.get(textColorType);
                this.setBackgroundColor(Color.parseColor(backgroundHexColor));
                this.setTextColor(Color.parseColor(textHexColor));

            } finally {
                a.recycle();
            }
        }
    }

    public EulerityTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        if (attrs != null) {

            TypedArray a = context.getTheme().obtainStyledAttributes(
                    attrs,
                    R.styleable.EulerityTextView,
                    0, 0);

            try {
                String backgroundColorType = a.getString(R.styleable.EulerityTextView_eulerityBackgroundColor);
                String textColorType = a.getString(R.styleable.EulerityTextView_eulerityTextColor);
                String backgroundHexColor = DataManager.colorSet.get(backgroundColorType);
                String textHexColor = DataManager.colorSet.get(textColorType);
                this.setBackgroundColor(Color.parseColor(backgroundHexColor));
                this.setTextColor(Color.parseColor(textHexColor));
            } finally {
                a.recycle();
            }
        }
    }




}
