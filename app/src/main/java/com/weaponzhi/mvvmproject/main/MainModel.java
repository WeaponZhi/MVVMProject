package com.weaponzhi.mvvmproject.main;

import android.content.Intent;
import android.databinding.ObservableField;
import android.view.View;
import android.widget.Toast;

import com.weaponzhi.mvvmproject.home.HomeActivity;

/**
 * Model 首页 model
 * author:张冠之
 * time: 2017/8/29 下午1:30
 * e-mail: guanzhi.zhang@sojex.cn
 */

public class MainModel extends MainContact.Model {

    public ObservableField<String> username = new ObservableField<>();
    public ObservableField<String> nickname = new ObservableField<>();
    public ObservableField<Integer> age = new ObservableField<>();

    public MainModel(String username,String nickname,int age){
        this.username.set(username);
        this.nickname.set(nickname);
        this.age.set(age);
    }

    public void onItemClick(View view) {
        Toast.makeText(view.getContext(), "通知 model层，异步请求，获取用户信息", Toast.LENGTH_SHORT).show();
        username.set("111");
    }

    public void onButtonClick(View view){
        view.getContext().startActivity(new Intent(view.getContext(), HomeActivity.class));
    }

    @Override
    void dataManager() {

    }
}
