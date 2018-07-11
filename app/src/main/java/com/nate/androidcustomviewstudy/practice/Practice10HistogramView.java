package com.nate.androidcustomviewstudy.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

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

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);

        Path path = new Path();
        path.moveTo(100,100);
        path.lineTo(100,400);
        path.lineTo(800,400);
        canvas.drawPath(path,paint);

        paint.setTextSize(14f);
        paint.setStrokeWidth(2);
        canvas.drawText("Froyo",120,420,paint);
        canvas.drawText("GB",220,420,paint);
        canvas.drawText("ICS",320,420,paint);
        canvas.drawText("JB",420,420,paint);
        canvas.drawText("KitKat",520,420,paint);
        canvas.drawText("L",620,420,paint);
        canvas.drawText("M",720,420,paint);

        paint.setTextSize(44f);
        canvas.drawText("直方图",450,620,paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        canvas.drawRect(110,390,190,400,paint);
        canvas.drawRect(210,350,290,400,paint);
        canvas.drawRect(310,300,390,400,paint);
        canvas.drawRect(410,280,490,400,paint);
        canvas.drawRect(510,320,590,400,paint);
        canvas.drawRect(610,330,690,400,paint);
        canvas.drawRect(710,370,790,400,paint);
    }
}
