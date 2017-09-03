package com.weaponzhi.mvvmproject.common;


import android.databinding.BaseObservable;

/**
 * Created by pc on 2017/9/2.
 */

public abstract class BaseViewModel<V extends BaseView> extends BaseObservable {
    private V mView;

    public BaseViewModel() {

    }

    public V getView() {
        return mView;
    }


    public void setView(V v) {
        mView = v;
    }

    protected abstract void init();

}
