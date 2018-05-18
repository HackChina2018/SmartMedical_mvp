package cn.hachchina.nuaa.smartmedical.View.Impl;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import cn.hachchina.nuaa.smartmedical.R;
import cn.hachchina.nuaa.smartmedical.View.ISelfCenterView;

/*
个人中心
 */
public class SelfCenterActivity extends Activity implements ISelfCenterView {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selfcenter_activity_layout);
    }
}
