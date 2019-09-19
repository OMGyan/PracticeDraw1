package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint mPaint;
    private Paint textPaint;
    private RectF normalRectf;
    private Paint linePaint;

    private int centerX,centerY,radius;

    public Practice11PieChartView(Context context) {
        this(context,null);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

         mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
         normalRectf = new RectF(150, 300, 450, 600);

         textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
         textPaint.setColor(Color.WHITE);
         textPaint.setTextSize(28);

         linePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
         linePaint.setStrokeWidth(2);
         linePaint.setColor(Color.WHITE);

         centerX = (int) ((normalRectf.right - normalRectf.left) / 2 + normalRectf.left);
         centerY = (int) ((normalRectf.bottom - normalRectf.top) / 2 + normalRectf.top);
         radius = (int) ((normalRectf.right - normalRectf.left) / 2);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
          mPaint.setColor(Color.BLUE);
          canvas.drawArc(normalRectf,80,90,true,mPaint);
         /* 圆点坐标：(x0,y0)
           半径：r
           角度：a0

          则圆上任一点为：（x1,y1）
          x1 = x0 + r * cos(ao * 3.14 /180 )
          y1 = y0 + r * sin(ao * 3.14 /180 )*/
          float x =((float) (centerX + radius * Math.cos(125 * Math.PI / 180)));
          float y =((float) (centerY + radius * Math.sin(125 * Math.PI / 180)));
          float[] points = {x,y,190,595,190,595,100,595};
          canvas.drawLines(points,linePaint);
          canvas.drawText("KitKat",10,600,textPaint);



          mPaint.setColor(Color.GREEN);
          canvas.drawArc(normalRectf,15,63,true,mPaint);
          float x1 = (float)(centerX + radius * Math.cos(46.5 * Math.PI / 180));
          float y1 = (float)(centerY + radius * Math.sin(46.5 * Math.PI / 180));
          float[] points1 = {x1,y1,435,585,435,585,500,585};
          canvas.drawLines(points1,linePaint);
          canvas.drawText("Jelly Bean",520,590,textPaint);


          mPaint.setColor(Color.RED);
          canvas.drawArc(normalRectf,5,8,true,mPaint);
          float x2 = (float)(centerX + radius * Math.cos(9 * Math.PI / 180));
          float y2 = (float)(centerY + radius * Math.sin(9 * Math.PI / 180));
          float[] points2 = {x2,y2,484,472,484,472,510,502,510,502,535,502};
          canvas.drawLines(points2,linePaint);
          canvas.drawText("Ice Cream Sandwich",555,507,textPaint);


          mPaint.setColor(Color.YELLOW);
          canvas.drawArc(normalRectf,-2,5,true,mPaint);
          float x3 = (float)(centerX + radius * Math.cos(0.5 * Math.PI / 180));
          float y3 = (float)(centerY + radius * Math.sin(0.5 * Math.PI / 180));
          float[] points3 = {x3,y3,475,452,475,452,495,423,495,423,520,423};
          canvas.drawLines(points3,linePaint);
          canvas.drawText("Gingerbread",540,428,textPaint);

          mPaint.setColor(Color.BLACK);
          canvas.drawArc(normalRectf,-4,-65,true,mPaint);
          float x4 = (float)(centerX + radius * Math.cos(-36.5 * Math.PI / 180));
          float y4 = (float)(centerY + radius * Math.sin(-36.5 * Math.PI / 180));
          float[] points4 = {x4,y4,460,332,460,332,530,332};
          canvas.drawLines(points4,linePaint);
          canvas.drawText("Marshmallow",550,337,textPaint);

          mPaint.setColor(Color.LTGRAY);
          canvas.drawArc(new RectF(140, 290, 440, 590),-71,-117,true,mPaint);

           centerX = (int) ((440 - 140) / 2 + 140);
           centerY = (int) ((590 - 290) / 2 + 290);
           radius = (int) ((440 - 140) / 2);


          float x5 = (float)(centerX + radius * Math.cos(-129.5 * Math.PI / 180));
          float y5 = (float)(centerY + radius * Math.sin(-129.5 * Math.PI / 180));
          float[] points5 = {x5,y5,170,303,170,303,130,303};
          canvas.drawLines(points5,linePaint);
          canvas.drawText("Lollipop",12,310,textPaint);


          //画标题
          Paint paint3 = new Paint(Paint.ANTI_ALIAS_FLAG);
          paint3.setColor(Color.WHITE);
          paint3.setTextSize(50);
          canvas.drawText("饼图",330,690,paint3);
    }


}
