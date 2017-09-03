package com.weaponzhi.mvvmproject.main;

/**
 * Model 首页 model
 * author:张冠之
 * time: 2017/8/29 下午1:30
 * e-mail: guanzhi.zhang@sojex.cn
 */

public class MainModel extends MainContact.Model {

    public String username = "";
    public String nickname = "";
    public int age;

    public MainModel(String username,String nickname,int age){
        this.username = username;
        this.nickname = nickname;
        this.age = age;
    }


}
