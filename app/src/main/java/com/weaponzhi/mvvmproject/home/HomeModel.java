package com.weaponzhi.mvvmproject.home;

import android.databinding.ObservableField;
import android.view.View;

/**
 * Created by WeaponZhi on 2017/9/3.
 */

public class HomeModel extends HomeContact.Model{
    public ObservableField<String> username = new ObservableField<>();
    public ObservableField<String> nickname = new ObservableField<>();
    public ObservableField<Integer> age = new ObservableField<>();

    public HomeModel(String username,String nickname,int age){
        this.username.set(username);
        this.nickname.set(nickname);
        this.age.set(age);
    }

    public void onItemClick(View view){
        username.set("111");
    }
}
