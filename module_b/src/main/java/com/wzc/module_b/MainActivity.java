package com.wzc.module_b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sankuai.waimai.router.Router;
import com.sankuai.waimai.router.annotation.RouterUri;
import com.sankuai.waimai.router.core.UriRequest;
import com.wzc.base.ARouterPath;

@RouterUri(path = ARouterPath.ModuleB.Test1)
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_open_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_b_activity_main);
        btn_open_second = findViewById(R.id.module_b_btn_open_second);
        btn_open_second.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btn_open_second) {
            Router.startUri(new UriRequest(this, ARouterPath.ModuleB.Test2));
        }
    }
}
