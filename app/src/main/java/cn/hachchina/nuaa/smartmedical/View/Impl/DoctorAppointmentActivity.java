package cn.hachchina.nuaa.smartmedical.View.Impl;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import cn.hachchina.nuaa.smartmedical.R;
import cn.hachchina.nuaa.smartmedical.View.IDoctorAppointmentView;

/*
预约医生
 */
public class DoctorAppointmentActivity extends Activity implements IDoctorAppointmentView {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctorappointment_activity_layout);
    }
}
