package com.wzc.module_a;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.wzc.base.ARouterPath;

@Route(path = ARouterPath.ModuleA.Test1)
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_open_second;
    private Button btn_open_module_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_a_activity_main);
        btn_open_second = findViewById(R.id.module_a_btn_open_second);
        btn_open_module_b = findViewById(R.id.module_a_btn_open_b);
        btn_open_second.setOnClickListener(this);
        btn_open_module_b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btn_open_second) {
            ARouter.getInstance().build(ARouterPath.ModuleA.Test2).navigation();
        } else if (v == btn_open_module_b) {
            ARouter.getInstance().build(ARouterPath.ModuleB.Test1).navigation();
        }
    }
}
