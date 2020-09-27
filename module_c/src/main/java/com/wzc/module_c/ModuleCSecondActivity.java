package com.wzc.module_c;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sankuai.waimai.router.annotation.RouterUri;
import com.wzc.base.ARouterPath;

@RouterUri(path = ARouterPath.ModuleC.Test2)
public class ModuleCSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_c_second);
    }
}
