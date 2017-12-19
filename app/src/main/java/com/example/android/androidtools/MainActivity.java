package com.example.android.androidtools;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;

import hugo.weaving.DebugLog;

/**
 * author: zhufu
 * email : zhufu@vargo.com.cn
 * time  : 2017/12/19
 * desc  :
 * version : 1.0
 */
@DebugLog
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getName("zhufu", 20);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    public String getName(String name, int age) {
        SystemClock.sleep(15);
        return "姓名是：" + name + ",年龄是： " + age;
    }
}
