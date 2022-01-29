package com.samsung.it_school_2021;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawView extends View {

    public DrawView(Context context) {
        super(context);
    }

    public DrawView(Context context,
                    @Nullable AttributeSet attrs,
                    int defStyleAttr,
                    int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        @SuppressLint("DrawAllocation") Paint paint = new Paint();
        paint.setColor(Color.parseColor("#db1fcf"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);

        // canvas.drawRect(100, 100, 500, 500, paint);

        paint.setColor(Color.parseColor("#040975"));
        int width = getWidth();
        int height = getHeight();

        canvas.drawLine(0, height / 2f, width, height / 2f, paint);
//        canvas.drawLine(0, 0, width, height, paint);
//        canvas.drawLine(width, 0, 0, height, paint);
        canvas.drawLine(width / 2f, 0, width / 2f, height, paint);

        // f(x) = a * x * x + b * x + c
        // f(x) = x * x -> O(w/2,h/2)

        for (int i = - 300; i < 300; i++) {
            float x = i + width / 2f;
            float y = 0.004f * i * i + height / 2f;
            canvas.drawPoint(x, y, paint);
        }


    }
}
