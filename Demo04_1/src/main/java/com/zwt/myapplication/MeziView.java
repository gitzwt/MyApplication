package com.zwt.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by hui on 2016/3/30.
 */

/*定义一个妹子的View*/
public class MeziView extends View {
    //定义相关变量，依次是妹子显示位置的X，Y坐标
    public float bitmapX;
    public float bitmapY;

    public MeziView(Context context) {
        super(context);
        //设置妹子的起始坐标
        bitmapX = 0;
        bitmapY = 200;
    }

    //重写View类的onDraw()方法
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //创建，并且实例化Paint的对象
        Paint paint = new Paint();
        //根据图片生成位图对象
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.s_jump);
        //绘制萌妹子
        canvas.drawBitmap(bitmap, bitmapX, bitmapY, paint);
        //判断图片是否回收，没回收的话强制回收图片
        if (bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }
}
