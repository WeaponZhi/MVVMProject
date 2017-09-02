package com.weaponzhi.mvvmproject;

import com.weaponzhi.mvvmproject.Entity.MainModel;
import com.weaponzhi.mvvmproject.common.BaseActivity;
import com.weaponzhi.mvvmproject.common.BaseModel;
import com.weaponzhi.mvvmproject.common.BaseViewModel;
import com.weaponzhi.mvvmproject.viewmodel.MainViewModel;

/**
 * Created by WeaponZhi on 2017/9/1.
 */

public interface MainContact {
    abstract class Model extends BaseModel {

    }


    abstract class View extends BaseActivity<MainViewModel> {

    }

    abstract class ViewModel extends BaseViewModel<View, MainModel> {

    }
}
