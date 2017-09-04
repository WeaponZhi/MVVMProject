package com.weaponzhi.mvvmproject.main;

import android.databinding.ObservableField;

import com.weaponzhi.mvvmproject.common.BaseEntry;

/**
 * MainEntry Main 实体类
 * author:张冠之
 * time: 2017/9/4 上午9:36
 * e-mail: guanzhi.zhang@sojex.cn
 */

public class MainEntry extends BaseEntry{
    public ObservableField<String> username = new ObservableField<>();
    public ObservableField<String> nickname = new ObservableField<>();
    public ObservableField<Integer> age = new ObservableField<>();

    public MainEntry(String username,String nickname,int age){
        this.username.set(username);
        this.nickname.set(nickname);
        this.age.set(age);
    }

}
