package com.weaponzhi.mvvmproject;

import com.weaponzhi.mvvmproject.main.MainContact;
import com.weaponzhi.mvvmproject.main.MainModel;
import com.weaponzhi.mvvmproject.main.MainViewModel;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    MainViewModel vm = new MainViewModel();
    MainModel model = new MainModel();
    MainContact.View mView = new MainContact.View() {
        @Override
        public void onResponse() {

        }

        @Override
        public int getLayoutId() {
            return 0;
        }

        @Override
        public void initView() {

        }
    };
    @Test
    public void main(){
        vm.setModel(model);
        vm.setView(mView);


    }
}