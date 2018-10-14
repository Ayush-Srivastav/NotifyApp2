package com.example.ayush.notifyapp.Model;

import com.example.ayush.notifyapp.Request.App_Request;
import com.example.ayush.notifyapp.View.Activity_View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 4/29/2018.
 */

public class Activity_Model implements App_Request.Model {

    private Activity_View mView;
    List<String> data = new ArrayList<>();
    @Override
    public List<String> getData() {
            data.add(mView.et_goToLink.getText().toString());
            data.add(mView.et_message.getText().toString());
            return data;
    }
}
