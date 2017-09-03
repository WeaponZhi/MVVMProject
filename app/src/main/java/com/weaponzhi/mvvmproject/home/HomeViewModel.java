package com.weaponzhi.mvvmproject.home;

/**
 * Created by WeaponZhi on 2017/9/3.
 */

public class HomeViewModel extends HomeContact.ViewModel{
    public HomeModel homeModel;

    @Override
    protected void init() {
        homeModel = new HomeModel("home","home",50);
    }

}
