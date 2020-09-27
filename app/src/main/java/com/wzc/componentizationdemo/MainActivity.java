package com.wzc.componentizationdemo;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sankuai.waimai.router.Router;
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
            Router.startUri(this, ARouterPath.ModuleA.Test1);
        } else if (v == btn_open_b) {
            Router.startUri(this,  ARouterPath.ModuleB.Test1);
        } else if (v == btn_open_c) {
            Router.startUri(this,  ARouterPath.ModuleC.Test1);
        }
    }
}
