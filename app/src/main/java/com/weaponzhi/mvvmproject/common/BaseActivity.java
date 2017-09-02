package com.weaponzhi.mvvmproject.common;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.weaponzhi.mvvmproject.BR;
import com.weaponzhi.mvvmproject.R;
import com.weaponzhi.mvvmproject.utils.TUtil;

import butterknife.ButterKnife;

/**
 * Created by pc on 2017/9/2.
 */

public abstract class BaseActivity<VM extends BaseViewModel> extends AppCompatActivity{
    public VM mViewModel;
    public ViewDataBinding viewDataBinding;
    public Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        doBeforeSetcontentView();
        setContentView(R.layout.activity_main);
        viewDataBinding = DataBindingUtil.setContentView(this, getLayoutId());
        initActivity();
        initView();
    }

    protected abstract void initView();

    protected abstract int getLayoutId();

    /*********************基类实现***********************/
    //设置 layout 之前的配置
    private void doBeforeSetcontentView() {

    }

    //做绑定的初始化
    private void initActivity() {
        ButterKnife.bind(this);
        mContext = this;

        mViewModel = TUtil.getT(this, 0);

        if (mViewModel != null) {
            mViewModel.setView(this);
        }

        viewDataBinding.setVariable(BR.model, mViewModel);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
