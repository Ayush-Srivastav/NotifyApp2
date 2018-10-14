package com.example.ayush.notifyapp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.ayush.notifyapp.Presenter.Activity_Presenter;
import com.example.ayush.notifyapp.R;
import com.example.ayush.notifyapp.Request.App_Request;

import java.util.ArrayList;
import java.util.List;

public class Activity_View extends AppCompatActivity implements App_Request.View {

    public EditText et_title , et_message , et_goToLink ;
    Spinner select;
    Button submit;
    private App_Request.Presenter mPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__view);

        mPresenter = new Activity_Presenter(this);
    }

    public void initView() {

        et_title = (EditText)findViewById(R.id.et_title);
        et_message = (EditText)findViewById(R.id.et_message);
        et_goToLink = (EditText)findViewById(R.id.et_link);
        select = (Spinner)findViewById(R.id.spinner);
        submit = (Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.onClick(view);
            }
        });
    }

    public void setViewData(List<String> data) {
        et_title.setVisibility(View.GONE);
        et_message.setVisibility(View.GONE);
    }

}
