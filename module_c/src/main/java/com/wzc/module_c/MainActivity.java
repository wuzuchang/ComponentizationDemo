package com.wzc.module_c;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.wzc.base.ARouterPath;


@Route(path = ARouterPath.ModuleC.Test1)
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_open_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_c_activity_main);
        btn_open_second = findViewById(R.id.module_c_btn_open_second);
        btn_open_second.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btn_open_second) {
            ARouter.getInstance().build(ARouterPath.ModuleC.Test2).navigation();
        }
    }
}
