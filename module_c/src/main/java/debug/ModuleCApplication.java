package debug;

import android.app.Application;

import com.sankuai.waimai.router.Router;
import com.sankuai.waimai.router.common.DefaultRootUriHandler;

/**
 * Author: Wuzuchang
 * Date: 2019/8/4 18:48
 * Description: ${DESCRIPTION}
 */
public class ModuleCApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 创建RootHandler
        DefaultRootUriHandler rootHandler = new DefaultRootUriHandler(this.getApplicationContext());
        // 初始化
        Router.init(rootHandler);
    }
}
