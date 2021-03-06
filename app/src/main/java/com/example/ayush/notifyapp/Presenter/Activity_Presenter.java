package com.example.ayush.notifyapp.Presenter;

import android.view.View;

import com.example.ayush.notifyapp.Model.Activity_Model;
import com.example.ayush.notifyapp.Request.App_Request;
import com.example.ayush.notifyapp.View.Activity_View;

import java.util.List;

/**
 * Created by lenovo on 4/29/2018.
 */

public class Activity_Presenter implements App_Request.Presenter
{
    private App_Request.Model mModel;
    private Activity_View mView;

    public Activity_Presenter(Activity_View view) {
        mView = view;
        initPresenter();
    }

    private void initPresenter() {
        mModel = new Activity_Model();
        mView.initView();
    }

    @Override
    public void onClick(View view) {
        List<String> data = mModel.getData();

        mView.setViewData(data);

    }
}
