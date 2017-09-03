package com.weaponzhi.mvvmproject.main;

import android.view.View;
import android.widget.Toast;

/**
 * MainViewModel 首页VM
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
        Toast.makeText(view.getContext(), "通知 model层，异步请求，获取用户信息", Toast.LENGTH_SHORT).show();
    }
    public String getUsername(){
        return getModel().username;
    }
    public String getNickname(){
        return getModel().nickname;
    }

    public int getAge(){
        return getModel().age;
    }

}
