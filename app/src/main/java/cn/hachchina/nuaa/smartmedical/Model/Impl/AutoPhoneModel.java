package cn.hachchina.nuaa.smartmedical.Model.Impl;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;

import cn.hachchina.nuaa.smartmedical.Model.IAutoPhoneModel;

public class AutoPhoneModel implements IAutoPhoneModel {


    public void call(String number, Context context) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Uri data = Uri.parse("tel:" + number);
        intent.setData(data);
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        context.startActivity(intent);
    }
}
