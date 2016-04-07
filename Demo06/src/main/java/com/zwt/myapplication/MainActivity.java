package com.zwt.myapplication;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtZWT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        txtZWT = (TextView) findViewById(R.id.txtZWT);
        Drawable[] drawable = txtZWT.getCompoundDrawables();
        //数组下标0~3，依次是：左上右下
        drawable[1].setBounds(100, 0, 200, 200);
        txtZWT.setCompoundDrawables(drawable[0], drawable[1], drawable[2], drawable[3]);
    }
}

