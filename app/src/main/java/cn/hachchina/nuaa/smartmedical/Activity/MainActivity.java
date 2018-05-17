package cn.hachchina.nuaa.smartmedical.Activity;

import android.app.Activity;


import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.hachchina.nuaa.smartmedical.R;
import cn.hachchina.nuaa.smartmedical.Util.VerifyPermissionUtil;

import static cn.hachchina.nuaa.smartmedical.Util.CallPhoneUtil.call;

public class MainActivity extends Activity {

    private Button button;
    private VerifyPermissionUtil verifyPermissionUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_layout);

        if (Build.VERSION.SDK_INT >= 23) {
            VerifyPermissionUtil verifyPermissionUtil = new VerifyPermissionUtil(MainActivity.this);
            verifyPermissionUtil.RequestPermission();
        }


        button = findViewById(R.id.emergency_call);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call("10086", MainActivity.this);
            }
        });


    }


}
