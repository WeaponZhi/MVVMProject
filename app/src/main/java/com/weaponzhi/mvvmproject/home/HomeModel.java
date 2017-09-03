package com.weaponzhi.mvvmproject.home;

/**
 * Created by WeaponZhi on 2017/9/3.
 */

public class HomeModel extends HomeContact.Model{
    public String username;
    public String nickname;
    public int age;

    public HomeModel(String username,String nickname,int age){
        this.username = username;
        this.nickname = nickname;
        this.age = age;
    }
}
