package com.hencoder.hencoderpracticedraw4.practice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw4.R;

public class Practice02ClipPathView extends View {
	Paint paint = new Paint();
	Bitmap bitmap;
	Point point1 = new Point(200, 200);
	Point point2 = new Point(600, 200);

	public Practice02ClipPathView(Context context) {
		super(context);
	}

	public Practice02ClipPathView(Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
	}

	public Practice02ClipPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	{
		bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.maps);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);


		canvas.save();
		Path circlePath = new Path();
		circlePath.addCircle(point1.x + 100, point1.y + 100, 100, Path.Direction.CW);
		canvas.clipPath(circlePath);
		canvas.drawBitmap(bitmap, point1.x, point1.y, paint);
		canvas.restore();

		canvas.save();
		Path path = new Path();
		path.setFillType(Path.FillType.INVERSE_WINDING);
		path.addCircle(point2.x + 200, point2.y + 200, 150, Path.Direction.CW);
		canvas.clipPath(path);
		canvas.drawBitmap(bitmap, point2.x, point2.y, paint);
		canvas.restore();
	}
}
