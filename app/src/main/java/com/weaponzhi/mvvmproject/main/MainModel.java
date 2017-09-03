package com.weaponzhi.mvvmproject.main;

import android.databinding.ObservableField;

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

    @Override
    void dataManager() {

    }
}
