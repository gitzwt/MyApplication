package com.zwt.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout frame = (FrameLayout) findViewById(R.id.FrameLayout1);
        final MeziView meizi = new MeziView(MainActivity.this);
        //为我们的萌妹子添加触摸事件监听器
        meizi.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //设置妹子显示的位置
                meizi.bitmapX = event.getX() - 150;
                meizi.bitmapY = event.getY() - 150;
                //调用重绘方法
                meizi.invalidate();
                return true;
            }
        });
        frame.addView(meizi);
    }
}
