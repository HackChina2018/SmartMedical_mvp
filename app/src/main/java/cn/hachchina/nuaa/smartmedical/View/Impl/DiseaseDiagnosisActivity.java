package cn.hachchina.nuaa.smartmedical.View.Impl;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import cn.hachchina.nuaa.smartmedical.R;
import cn.hachchina.nuaa.smartmedical.View.IDiseaseDiagnosisView;

/*
常见疾病诊断
 */
public class DiseaseDiagnosisActivity extends Activity implements IDiseaseDiagnosisView {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diseasediagnosis_activity_layout);
    }
}
