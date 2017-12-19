package com.example.android.androidtools;

import android.app.Application;

import com.github.moduth.blockcanary.BlockCanary;
import com.squareup.leakcanary.LeakCanary;

/**
 * author: zhufu
 * email : zhufu@vargo.com.cn
 * time  : 2017/12/19
 * desc  :
 * version : 1.0
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            initTools();
        }
    }

    private void initTools() {
        //检测内存泄露
        LeakCanary.install(this);

        //检测anr
        BlockCanary.install(this, new AppBlockCanaryContext()).start();
    }

}
