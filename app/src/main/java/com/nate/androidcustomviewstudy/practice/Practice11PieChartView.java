package com.nate.androidcustomviewstudy.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.RED);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawArc(100,100,600,600,-180,130,true,paint);
            paint.setColor(Color.YELLOW);
            canvas.drawArc(100,100,600,600,-55,55,true,paint);
            paint.setColor(Color.LTGRAY);
            canvas.drawArc(100,100,600,600,5,25,true,paint);
            paint.setColor(Color.BLUE);
            canvas.drawArc(100,100,600,600,30,155,true,paint);

        }
    }
}
