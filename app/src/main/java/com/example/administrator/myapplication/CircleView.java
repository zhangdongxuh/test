package com.example.administrator.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/11/28.
 */
public class CircleView extends View {
    private Bitmap bitmap;

    public CircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        //布局
       bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);

    }
    public CircleView(Context context) {
        //代码实
        super(context);
        bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);
    }

    @Override
    protected void onDraw(Canvas canvas) {//画布
        //實例化畫筆
        Paint mPaint=new Paint();
        mPaint.setTextSize(30);
        mPaint.setColor(Color.BLUE);
        //繪製文字
        canvas.drawText("this is onDraw",0,30,mPaint);
        //绘制直线
        canvas.drawLine(0,60,200,60,mPaint);
        //绘制矩形
        canvas.drawRect(0,90,30,120,mPaint);
        RectF rectF=new RectF(0,150,30,180);
//      canvas.drawRect(rectF,mPaint);
        //绘制圆角矩形
        canvas.drawRoundRect(rectF,10,10,mPaint);
        //绘制圆形
        //画笔设置空心
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(50,260,50,mPaint);
        //绘制图片
        canvas.drawBitmap(bitmap,0,350,mPaint);
    }
}
