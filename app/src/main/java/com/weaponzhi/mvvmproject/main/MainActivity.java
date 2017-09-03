package com.weaponzhi.mvvmproject.main;

import android.databinding.Observable;

import com.weaponzhi.mvvmproject.R;
import com.weaponzhi.mvvmproject.common.BaseActivity;

/**
 * MainActivity 首页
 * author:张冠之
 * time: 2017/9/2 下午11:04
 * e-mail: guanzhi.zhang@sojex.cn
 */

public class MainActivity extends BaseActivity<MainViewModel> implements MainContact.View{

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        getViewModel().getInitData();//调用 VM 接口
        //双向绑定，在 VIEW 层不用接口处理方法
        getViewModel().mainModel.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {

            }
        });
    }
    //view 接口
    @Override
    public void onResponse() {

    }
}
