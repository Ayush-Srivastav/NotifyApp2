package com.example.ayush.notifyapp.Request;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by lenovo on 4/29/2018.
 */

public interface Notification_Request {
    @POST("noti_controller/send_noti")
    Call<RequestPOJO> requestResponse();
}
