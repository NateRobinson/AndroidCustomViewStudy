package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw2.R;

public class Practice05ComposeShaderView extends View {
	Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

	public Practice05ComposeShaderView(Context context) {
		super(context);
	}

	public Practice05ComposeShaderView(Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
	}

	public Practice05ComposeShaderView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	{
		setLayerType(LAYER_TYPE_SOFTWARE, null); // 硬件加速下 ComposeShader 不能使用两个同类型的 Shader

		// 用 Paint.setShader(shader) 设置一个 ComposeShader
		// Shader 1: BitmapShader 图片：R.drawable.batman
		// Shader 2: BitmapShader 图片：R.drawable.batman_logo
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

		Bitmap bitmapBatman = BitmapFactory.decodeResource(getResources(), R.drawable.batman);
		BitmapShader bitmapShaderBatman = new BitmapShader(bitmapBatman, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
		Bitmap bitmapLogo = BitmapFactory.decodeResource(getResources(), R.drawable.batman_logo);
		BitmapShader bitmapShaderLogo = new BitmapShader(bitmapLogo, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);


		paint.setShader(new ComposeShader(bitmapShaderBatman, bitmapShaderLogo, PorterDuff.Mode.DST_IN));

		canvas.drawCircle(200, 200, 200, paint);
	}
}
