package com.weaponzhi.mvvmproject.common;


import android.databinding.BaseObservable;

/**
 * Created by pc on 2017/9/2.
 */

public abstract class BaseViewModel<V extends BaseView,M extends BaseModel> extends BaseObservable {
    private V mView;
    private M mModel;

    public BaseViewModel() {
    }

    public V getView() {
        return mView;
    }


    public void setView(V v) {
        mView = v;
    }

    public M getModel(){
        return mModel;
    }

    public void setModel(M m){
        mModel = m;
    }

    protected abstract void init();

}
