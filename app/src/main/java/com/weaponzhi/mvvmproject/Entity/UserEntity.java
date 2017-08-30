package com.weaponzhi.mvvmproject.Entity;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

import com.weaponzhi.mvvmproject.BR;

/**
 * UserEntity 能实现双向绑定的实体 Model
 * author:张冠之
 * time: 2017/8/29 下午1:30
 * e-mail: guanzhi.zhang@sojex.cn
 */

public class UserEntity extends BaseObservable {

    ObservableField<String> username = new ObservableField<>();
    ObservableField<String> nickname = new ObservableField<>();
    ObservableField<Integer> age = new ObservableField<>();


    public UserEntity() {

    }

    public UserEntity(int age, String nickname, String username) {
        this.age.set(age);
        this.username.set(username);
        this.nickname.set(nickname);
    }

    public String getUsername() {
        return username.get();
    }

    @Bindable
    public void setUsername(String username) {
        this.username.set(username);
        notifyPropertyChanged(BR.username);
    }

    public String getNickname() {
        return nickname.get();
    }

    @Bindable
    public void setNickname(String nickname) {
        this.nickname.set(nickname);
        notifyPropertyChanged(BR.nickname);
    }

    public int getAge() {
        return age.get();
    }

    @Bindable
    public void setAge(int age) {
        this.age.set(age);
        notifyPropertyChanged(BR.age);
    }

}
