package com.weaponzhi.mvvmproject.main;

import android.databinding.Observable;
import android.widget.Toast;

import com.weaponzhi.mvvmproject.R;
import com.weaponzhi.mvvmproject.common.BaseActivity;

/**
 * MainActivity 首页
 * author:张冠之
 * time: 2017/9/2 下午11:04
 * e-mail: guanzhi.zhang@sojex.cn
 */

public class MainActivity extends BaseActivity<MainViewModel,MainModel> implements MainContact.View{

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        getViewModel().getData();//调用 VM 接口
        //双向绑定，在 VIEW 层不用接口处理方法
        getViewModel().mainEntry.username.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                Toast.makeText(mContext,getViewModel().mainEntry.username.get(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    //view 接口，放UI操作
    @Override
    public void onResponse() {
        getViewModel().getData();
    }
}
