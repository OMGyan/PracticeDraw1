package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint paint;
    private Paint paint1;

    public Practice8DrawArcView(Context context) {
        this(context,null);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.STROKE);

        paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        canvas.drawArc(new RectF(getWidth()/3,getWidth()/4-50,getWidth()/3*2,getWidth()/2-50),-180,60,false,paint);
        canvas.drawArc(new RectF(getWidth()/3,getWidth()/4-50,getWidth()/3*2,getWidth()/2-50),-110,100,true,paint1);
        canvas.drawArc(new RectF(getWidth()/3,getWidth()/4-50,getWidth()/3*2,getWidth()/2-50),20,140,false,new Paint(Paint.ANTI_ALIAS_FLAG));
    }
}
