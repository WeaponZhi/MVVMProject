package com.weaponzhi.mvvmproject.main;

import com.weaponzhi.mvvmproject.common.BaseModel;
import com.weaponzhi.mvvmproject.common.BaseView;
import com.weaponzhi.mvvmproject.common.BaseViewModel;

/**
 * MainContact 首页接口管理
 * author:张冠之
 * time: 2017/9/2 下午11:04
 * e-mail: guanzhi.zhang@sojex.cn
 */


interface MainContact {
    abstract class Model extends BaseModel {

    }


    interface View extends BaseView{

    }

    abstract class ViewModel extends BaseViewModel<View, MainModel> {

    }
}
