package com.weaponzhi.mvvmproject.main;

import android.databinding.Bindable;
import android.databinding.ObservableField;

import com.weaponzhi.testlib.common.BaseEntry;


/**
 * MainEntry Main 实体类
 * author:张冠之
 * time: 2017/9/4 上午9:36
 * e-mail: guanzhi.zhang@sojex.cn
 */

public class MainEntry extends BaseEntry {
    public ObservableField<String> username = new ObservableField<>();
    public ObservableField<String> nickname = new ObservableField<>();
    public ObservableField<Integer> age1 = new ObservableField<>();
    @Bindable
    public int age2;
    @Bindable
    public int age3;
    @Bindable
    public int age4;
    @Bindable
    public int age8;

    public MainEntry(String username,String nickname,int age,int age2,int age3,int age5){
        this.username.set(username);
        this.nickname.set(nickname);
        this.age1.set(age);
        this.age2 = age2;
        this.age3 = age3;
        this.age8 =age5;
    }

}
