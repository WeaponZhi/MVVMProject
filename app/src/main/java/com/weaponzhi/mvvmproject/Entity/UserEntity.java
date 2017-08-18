package com.weaponzhi.mvvmproject.Entity;

/**
 * Created by WeaponZhi on 2017/8/18.
 */

public class UserEntity {
    private String username;
    private String nickname;
    private int age;

    public UserEntity(){

    }

    public UserEntity(int age,String nickname,String username){
        this.age = age;
        this.username = username;
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
