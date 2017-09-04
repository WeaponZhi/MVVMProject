package com.weaponzhi.mvvmproject.main;

/**
 * Model 首页 model
 * author:张冠之
 * time: 2017/8/29 下午1:30
 * e-mail: guanzhi.zhang@sojex.cn
 */

public class MainModel extends MainContact.Model {

    //发送 http 请求
    @Override
    void onHttpRequest() {
        //http 请求成功
        getViewModel().onSuccess();
        //http 请求失败
        getViewModel().onError();
    }

}
