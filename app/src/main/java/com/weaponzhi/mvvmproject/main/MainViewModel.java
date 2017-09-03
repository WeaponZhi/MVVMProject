package com.weaponzhi.mvvmproject.main;

import android.content.Intent;
import android.databinding.Bindable;
import android.view.View;

import com.weaponzhi.mvvmproject.BR;
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

    @Override
    protected void init() {
       setModel(new MainModel("weaponzhi","xiaozhi",23));
    }

    public void onItemClick(View view) {
//        Toast.makeText(view.getContext(), "通知 model层，异步请求，获取用户信息", Toast.LENGTH_SHORT).show();
        setUsername();
    }

    public void onButtonClick(View view){
        view.getContext().startActivity(new Intent(view.getContext(), HomeActivity.class));
    }

    @Bindable
    public String getUsername(){
        return getModel().username.get();
    }

    public String getNickname(){
        return getModel().nickname.get();
    }

    public int getAge(){
        return getModel().age.get();
    }

    public void setUsername(){
        getModel().username.set("111");
        notifyPropertyChanged(BR.username);
    }

    @Override
    void getInitData() {
        //调用 view 接口
        //注意，在 VM 中调用 view 接口会导致该方法不可测
        //仅特殊情况使用，尽量通过 addOnPropertyChangedCallback 进行监听
        getView().onResponse();
    }

    @Override
    void onSuccess() {
        getModel().dataManager();
    }

    @Override
    void onError() {

    }


}
