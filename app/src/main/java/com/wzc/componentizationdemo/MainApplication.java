package com.wzc.componentizationdemo;

import android.app.Application;

import com.sankuai.waimai.router.Router;
import com.sankuai.waimai.router.common.DefaultRootUriHandler;

/**
 * Author: Wuzuchang
 * Date: 2019/8/4 15:27
 * Description: ${DESCRIPTION}
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 创建RootHandler
        DefaultRootUriHandler rootHandler = new DefaultRootUriHandler(this.getApplicationContext());
        // 初始化
        Router.init(rootHandler);
    }
}
