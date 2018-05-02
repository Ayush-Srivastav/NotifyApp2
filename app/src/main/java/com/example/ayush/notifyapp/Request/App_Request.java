package com.example.ayush.notifyapp.Request;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by lenovo on 4/29/2018.
 */

public interface App_Request {

    interface View {
        void initView();

        void setViewData(List<String> data);

    }

    interface Model {
        List<String> getData();
    }

    interface Presenter {
        void onClick(android.view.View view);
    }

}
