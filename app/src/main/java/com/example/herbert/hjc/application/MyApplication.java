package com.example.herbert.hjc.application;

import android.app.Application;

import com.lzy.okgo.OkGo;

/**
 * Created by Herbert on 2018/4/18.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        OkGo.getInstance().init(this);
    }
}
