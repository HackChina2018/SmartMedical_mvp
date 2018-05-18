package cn.hachchina.nuaa.smartmedical.View.Impl;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import cn.hachchina.nuaa.smartmedical.R;
import cn.hachchina.nuaa.smartmedical.View.IMedicationRemiderView;

/*
用药提醒
 */
public class MedicationRemiderActivity extends Activity implements IMedicationRemiderView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicationremider_activity_layout);
    }
}
