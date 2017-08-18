package com.weaponzhi.mvvmproject;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.weaponzhi.mvvmproject.Entity.UserEntity;
import com.weaponzhi.mvvmproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        UserEntity user = new UserEntity();
        user.setAge(34);
        user.setNickname("小之");
        user.setUsername("WeaponZhi");
        activityMainBinding.setUser(user);
    }
}
