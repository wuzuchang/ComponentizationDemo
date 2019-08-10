package com.wzc.module_b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sankuai.waimai.router.annotation.RouterUri;

@RouterUri(path = "/module/b/second")
public class ModuleBSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_b_second);
    }
}
