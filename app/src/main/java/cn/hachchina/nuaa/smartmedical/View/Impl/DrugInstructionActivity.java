package cn.hachchina.nuaa.smartmedical.View.Impl;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import cn.hachchina.nuaa.smartmedical.R;
import cn.hachchina.nuaa.smartmedical.View.IDrugInstrctionmanualView;
/*
用药提醒
 */
public class DrugInstructionActivity extends Activity implements IDrugInstrctionmanualView {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.druginstructionmanual_activity_layout);
    }
}
