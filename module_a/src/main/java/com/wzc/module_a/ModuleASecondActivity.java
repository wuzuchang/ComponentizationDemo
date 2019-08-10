package com.wzc.module_a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sankuai.waimai.router.annotation.RouterUri;

@RouterUri(path = "/module/a/second")
public class ModuleASecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_a_second);
    }
}
