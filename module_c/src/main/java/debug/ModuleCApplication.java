package debug;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Author: Wuzuchang
 * Date: 2019/8/4 18:48
 * Description: ${DESCRIPTION}
 */
public class ModuleCApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化
        ARouter.init(this);
    }
}
