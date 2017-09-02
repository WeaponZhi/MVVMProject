package com.weaponzhi.mvvmproject.Entity;

import android.databinding.ObservableField;

import com.weaponzhi.mvvmproject.MainContact;

/**
 * Model 能实现双向绑定的实体 Model
 * author:张冠之
 * time: 2017/8/29 下午1:30
 * e-mail: guanzhi.zhang@sojex.cn
 */

public class MainModel extends MainContact.Model {

    public ObservableField<String> username = new ObservableField<>();
    public ObservableField<String> nickname = new ObservableField<>();
    public ObservableField<Integer> age = new ObservableField<>();


    @Override
    public void init() {
        username.set("weaponzhi");
        nickname.set("xiaozhi");
        age.set(23);
    }


}
