package com.weaponzhi.mvvmproject.main;

/**
 * MainViewModel 首页VM
 * author:张冠之
 * time: 2017/9/2 下午11:05
 * e-mail: guanzhi.zhang@sojex.cn
 */

public class MainViewModel extends MainContact.ViewModel {
    public MainModel mainModel;

    @Override
    protected void init() {
        mainModel = new MainModel("weaponzhi","xiaozhi",23);
    }


    @Override
    void getInitData() {
        //调用 view 接口
        //注意，在 VM 中调用 view 接口会导致该方法不可测
        //仅特殊情况使用，尽量通过 addOnPropertyChangedCallback 进行监听
        getView().onResponse();
    }

    @Override
    void onSuccess() {
        mainModel.dataManager();
    }

    @Override
    void onError() {

    }
}
