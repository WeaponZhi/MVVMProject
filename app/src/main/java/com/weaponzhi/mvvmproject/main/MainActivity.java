package com.weaponzhi.mvvmproject.main;

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

    }
}
