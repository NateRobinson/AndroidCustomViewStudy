package com.nate.androidcustomviewstudy.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

	public Practice2DrawCircleView(Context context) {
		super(context);
	}

	public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
	}

	public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆


		Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
		paint.setColor(Color.BLACK);
//		paint.setStyle(Paint.Style.FILL);
//		canvas.drawCircle(200, 150, 100, paint);
//
//		paint.setStyle(Paint.Style.STROKE);
//		paint.setStrokeWidth(5);
//		canvas.drawCircle(500, 150, 100, paint);
//
//		paint.setStyle(Paint.Style.FILL);
//		paint.setColor(Color.BLUE);
//		canvas.drawCircle(200, 450, 100, paint);
//
//		paint.setStyle(Paint.Style.STROKE);
//		paint.setColor(Color.BLACK);
//		paint.setStrokeWidth(30);
//		canvas.drawCircle(500, 450, 100, paint);

		Path path = new Path();
		path.addCircle(300,300,200, Path.Direction.CW);
		path.addCircle(600,300,200, Path.Direction.CCW);
		path.setFillType(Path.FillType.EVEN_ODD);
		canvas.drawPath(path,paint);

	}
}
