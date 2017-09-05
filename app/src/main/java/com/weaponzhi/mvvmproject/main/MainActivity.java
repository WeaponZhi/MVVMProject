package com.weaponzhi.mvvmproject.main;

import android.view.View;

import com.weaponzhi.mvvmproject.BR;
import com.weaponzhi.mvvmproject.R;
import com.weaponzhi.mvvmproject.databinding.ActivityMainBinding;
import com.weaponzhi.testlib.common.BaseActivity;

/**
 * MainActivity 首页
 * author:张冠之
 * time: 2017/9/2 下午11:04
 * e-mail: guanzhi.zhang@sojex.cn
 */

public class MainActivity extends BaseActivity<MainViewModel,MainModel> implements MainContact.View{
    private MainAdapter adapter;
    private String[] a = new String[]{"1","2","3","4"};
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        adapter = new MainAdapter(this,android.R.layout.simple_list_item_1,a);
        viewDataBinding.setVariable(BR.adapter,adapter);

        getViewModel().getData();//调用 VM 接口
        //双向绑定，在 VIEW 层不用接口处理方法
        ((ActivityMainBinding)viewDataBinding).btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = new String[]{"1","2","3","4","5"};
                adapter = new MainAdapter(mContext,android.R.layout.simple_list_item_1,a);
            }
        });
    }
    //view 接口，放UI操作
    @Override
    public void onResponse() {
        getViewModel().getData();
    }

    @Override
    public int getBR() {
        return BR.model;
    }
}
