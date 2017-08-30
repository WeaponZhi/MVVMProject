package com.weaponzhi.mvvmproject.viewmodel;

import android.app.Activity;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.weaponzhi.mvvmproject.Entity.UserEntity;
import com.weaponzhi.mvvmproject.databinding.ActivityMainBinding;

/**
 * Created by WeaponZhi on 2017/8/29.
 */

public class UserViewModel extends BaseObservable {
    public UserEntity user;
    public ActivityMainBinding mainBinding;
    public Activity activity;
    ObservableField<String> imageUrl = new ObservableField<>();
    public UserViewModel(Activity activity, ActivityMainBinding mainBinding) {
        this.activity = activity;
        this.mainBinding = mainBinding;
        mainBinding.setModel(this);
        init();
    }

    private void init() {
        user = new UserEntity(10, "weaponzhi", "xiaozhi");
    }

    public void onItemClick(View view) {
        Toast.makeText(view.getContext(), "通知 model层，异步请求，获取用户信息", Toast.LENGTH_SHORT).show();
    }

    public String getImageUrl() {
        return imageUrl.get();
    }

    @Bindable
    public void setImageUrl(String imageUrl) {
        this.imageUrl.set(imageUrl);
        notifyPropertyChanged(com.weaponzhi.mvvmproject.BR.imageUrl);
    }

    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView iv, String img) {
        Glide.with(iv.getContext())
                .load(img)
                .into(iv);
    }

}
