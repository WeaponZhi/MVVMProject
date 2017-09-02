package com.weaponzhi.mvvmproject.viewmodel;

import android.view.View;
import android.widget.Toast;

import com.weaponzhi.mvvmproject.Entity.MainModel;
import com.weaponzhi.mvvmproject.MainContact;

/**
 * Created by WeaponZhi on 2017/8/29.
 */

public class MainViewModel extends MainContact.ViewModel {

    @Override
    protected void init() {
        setModel(new MainModel());
    }

    public void onItemClick(View view) {
        Toast.makeText(view.getContext(), "通知 model层，异步请求，获取用户信息", Toast.LENGTH_SHORT).show();
    }

    public String getUsername(){
        return getModel().username.get();
    }

    public String getNickname(){
        return getModel().nickname.get();
    }

    public int getAge(){
        return getModel().age.get();
    }

}
