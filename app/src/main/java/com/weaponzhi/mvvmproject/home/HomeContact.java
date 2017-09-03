package com.weaponzhi.mvvmproject.home;

import com.weaponzhi.mvvmproject.common.BaseModel;
import com.weaponzhi.mvvmproject.common.BaseView;
import com.weaponzhi.mvvmproject.common.BaseViewModel;

/**
 * Created by WeaponZhi on 2017/9/2.
 */

interface HomeContact {
    //model 层接口仅供 VM 和自己调用
    abstract class Model extends BaseModel {

    }


    interface View extends BaseView {

    }

    abstract class ViewModel extends BaseViewModel<View,HomeModel> {

    }
}
