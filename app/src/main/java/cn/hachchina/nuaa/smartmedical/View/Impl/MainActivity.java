package cn.hachchina.nuaa.smartmedical.View.Impl;

import android.app.Activity;


import android.os.Build;
import android.os.Bundle;
import android.view.View;


import cn.hachchina.nuaa.smartmedical.Presenter.Impl.AutoPhonePresenter;
import cn.hachchina.nuaa.smartmedical.R;
import cn.hachchina.nuaa.smartmedical.Util.VerifyPermissionUtil;


import cn.hachchina.nuaa.smartmedical.View.IMainUIView;


public class MainActivity extends Activity implements IMainUIView {
    private AutoPhonePresenter autoPhonePresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_layout);
        init();


    }

    private void init() {
        if (Build.VERSION.SDK_INT >= 23) {
            VerifyPermissionUtil verifyPermissionUtil = new VerifyPermissionUtil(MainActivity.this);
            verifyPermissionUtil.RequestPermission();
        }

        autoPhonePresenter = new AutoPhonePresenter(this);

        findViewById(R.id.emergency_call).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                autoPhonePresenter.call("10086");
            }
        });
    }


    @Override
    public void ToDiseaseDiagnosisActivity() {

    }

    @Override
    public void ToDrugInstructionManualActivity() {

    }

    @Override
    public void ToDoctorAppointmentActivity() {

    }

    @Override
    public void ToRemoteDiagnosisActivity() {

    }

    @Override
    public void ToMedicationRemiderActivity() {

    }

    @Override
    public void ToSelfCenterActivity() {

    }
}
