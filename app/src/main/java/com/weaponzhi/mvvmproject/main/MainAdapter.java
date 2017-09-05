package com.weaponzhi.mvvmproject.main;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;

/**
 * Created by WeaponZhi on 2017/9/5.
 */

public class MainAdapter extends ArrayAdapter<String>{

    public String[] mStrings;

    public MainAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull String[] objects) {
        super(context, resource, objects);
//        setA(objects);
    }

    public void setA(String[] objects) {
        mStrings = objects;
        notifyDataSetChanged();
    }

    public String[] getStrings(){
        return mStrings;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return super.getItem(position);

    }
}
