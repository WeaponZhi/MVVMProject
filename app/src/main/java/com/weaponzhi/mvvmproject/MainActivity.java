package com.weaponzhi.mvvmproject;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.weaponzhi.mvvmproject.databinding.ActivityMainBinding;
import com.weaponzhi.mvvmproject.viewmodel.UserViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        UserViewModel userViewModel = new UserViewModel(this,activityMainBinding);
    }
}
