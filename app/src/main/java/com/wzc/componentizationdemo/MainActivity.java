package com.wzc.componentizationdemo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.wzc.base.ARouterPath;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_open_a, btn_open_b, btn_open_c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_open_a = findViewById(R.id.btn_open_a);
        btn_open_b = findViewById(R.id.btn_open_b);
        btn_open_c = findViewById(R.id.btn_open_c);
        btn_open_a.setOnClickListener(this);
        btn_open_b.setOnClickListener(this);
        btn_open_c.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btn_open_a) {
            ARouter.getInstance().build(ARouterPath.ModuleA.Test1).navigation();
        } else if (v == btn_open_b) {
            ARouter.getInstance().build(ARouterPath.ModuleB.Test1).navigation();
        } else if (v == btn_open_c) {
            ARouter.getInstance().build(ARouterPath.ModuleC.Test1).navigation();
        }
    }
}
