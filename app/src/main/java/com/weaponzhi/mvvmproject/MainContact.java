package com.weaponzhi.mvvmproject;

/**
 * Created by WeaponZhi on 2017/9/1.
 */

public interface MainContact {
    interface MainModel{
        void getDataHttp();
    }

    public static interface MainViewModel{
        void initVM();
    }

    public static interface MainView{
        void init();
        void onRefresh();
    }
}
