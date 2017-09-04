package com.weaponzhi.mvvmproject.main;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.weaponzhi.mvvmproject.home.HomeActivity;

/**
 * MainViewModel 首页VM
 * 提供两种和 model 的绑定方式，MainViewModel 可以隐藏 model
 * HomeViewModel 会简单点，但暴露出 model 了
 * author:张冠之
 * time: 2017/9/2 下午11:05
 * e-mail: guanzhi.zhang@sojex.cn
 */

public class MainViewModel extends MainContact.ViewModel {
    public MainEntry mainEntry;

    public void onItemClick(View view) {
        Toast.makeText(getContext(), "通知 model层，异步请求，获取用户信息", Toast.LENGTH_SHORT).show();
        mainEntry.username.set("xiaweizi");
    }

    public void onButtonClick(View view) {
        //可以拿到 context 对象
        getContext().startActivity(new Intent(getContext(), HomeActivity.class));
    }

    @Override
    protected void init() {
        mainEntry = new MainEntry("weaponzhi","xiaozhi",23);
        getModel().onHttpRequest();
    }

    @Override
    void getData() {
        //调用 view 接口
        //注意，在 VM 中调用 view 接口会导致该方法不可测
        //仅特殊情况使用，尽量通过 addOnPropertyChangedCallback 进行监听
    }

    @Override
    void onSuccess() {
        Log.i("response", "Http success");
        getView().onResponse();
    }

    @Override
    void onError() {
        Log.i("response", "Http error");
    }


}
