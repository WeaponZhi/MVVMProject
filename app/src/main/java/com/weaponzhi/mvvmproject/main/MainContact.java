package com.weaponzhi.mvvmproject.main;

import com.weaponzhi.mvvmproject.common.BaseModel;
import com.weaponzhi.mvvmproject.common.BaseView;
import com.weaponzhi.mvvmproject.common.BaseViewModel;

/**
 * MainContact 首页接口管理，方便单元测试
 * author:张冠之
 * time: 2017/9/2 下午11:04
 * e-mail: guanzhi.zhang@sojex.cn
 */


interface MainContact {
    abstract class Model extends BaseModel<ViewModel> {
        abstract void onHttpRequest();
    }


    interface View extends BaseView{
        void onResponse();
    }

    abstract class ViewModel extends BaseViewModel<View,Model> {
        abstract void getData();
        abstract void onSuccess();
        abstract void onError();
    }
}
