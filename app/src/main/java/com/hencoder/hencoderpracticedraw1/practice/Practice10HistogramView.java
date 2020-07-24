package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.R;

import androidx.annotation.Nullable;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //综合练习
        //练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        //画坐标轴
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);
        canvas.drawLine(100,30,100,500, paint);
        canvas.drawLine(100,500,1000,500,paint);

        //画X轴的文字
        Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint1.setColor(Color.WHITE);
        paint1.setTextSize(28);
        canvas.drawText("Froyo",150,525, paint1);
        canvas.drawText("GB",280,525,paint1);
        canvas.drawText("ICS",400,525,paint1);
        canvas.drawText("JB",520,525,paint1);
        canvas.drawText("KitKat",620,525,paint1);
        canvas.drawText("L",780,525,paint1);
        canvas.drawText("M",890,525,paint1);

        //画直方图
        Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint2.setColor(getResources().getColor(R.color.histogram));
        paint2.setStrokeWidth(100);
        float[] points = {180,499,180,495,300,499,300,400,420,499,420,400,540,499,540,450,660,499,660,200,780,499,780,300,900,499,900,350};
        canvas.drawLines(points,paint2);

        //画标题
        Paint paint3 = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint3.setColor(Color.WHITE);
        paint3.setTextSize(50);
        canvas.drawText("直方图",450,650,paint3);

    }
}
