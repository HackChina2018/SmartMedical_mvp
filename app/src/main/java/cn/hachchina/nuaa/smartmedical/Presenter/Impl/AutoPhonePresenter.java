package cn.hachchina.nuaa.smartmedical.Presenter.Impl;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;

import cn.hachchina.nuaa.smartmedical.Model.IAutoPhoneModel;
import cn.hachchina.nuaa.smartmedical.Model.Impl.AutoPhoneModel;
import cn.hachchina.nuaa.smartmedical.Presenter.IAutoPhonePresenter;
import cn.hachchina.nuaa.smartmedical.View.IMainUIView;

public class AutoPhonePresenter implements IAutoPhonePresenter {
    private IMainUIView iMainUIView;
    private IAutoPhoneModel iAutoPhoneModel;

    public AutoPhonePresenter(IMainUIView iMainUIView) {
        this.iMainUIView = iMainUIView;
        this.iAutoPhoneModel = new AutoPhoneModel();
    }

    @Override
    public void call(String num) {
        iAutoPhoneModel.call(num, (Context) iMainUIView);
    }
}
