package com.iscoding.library.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.iscoding.library.utils.LogUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtil.i("test");
        LogUtil.e("test");
    }
}
