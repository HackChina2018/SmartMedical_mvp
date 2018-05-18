package cn.hachchina.nuaa.smartmedical.Model;

import android.content.Context;

public interface IAutoPhoneModel {


     /*
    自动拨打电话，传入需要拨打的电话号码以及Activity的context
     */

    public void call(String number, Context context);
}
