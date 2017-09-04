package com.weaponzhi.mvvmproject.home;


import com.weaponzhi.mvvmproject.BR;
import com.weaponzhi.mvvmproject.R;
import com.weaponzhi.testlib.common.BaseActivity;

/**
 * Created by WeaponZhi on 2017/9/3.
 */

public class HomeActivity extends BaseActivity<HomeViewModel,HomeModel> implements HomeContact.View{

    @Override
    public int getLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    public void initView() {

    }

    @Override
    public int getBR() {
        return BR.model;
    }
}
