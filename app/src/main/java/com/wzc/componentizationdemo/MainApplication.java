package com.wzc.componentizationdemo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Author: Wuzuchang
 * Date: 2019/8/4 15:27
 * Description: ${DESCRIPTION}
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
    }
}
