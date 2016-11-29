package com.example.circletest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2016/11/29.
 */
public class Circle extends View {
    private float lastx;

    public Circle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Circle(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint mpaint = new Paint();
        mpaint.setTextSize(30);
        canvas.drawCircle(lastx, 30, 20, mpaint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);

    }

}
