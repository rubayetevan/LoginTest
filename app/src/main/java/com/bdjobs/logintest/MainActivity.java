package com.bdjobs.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.bdjobs.logintest.API.LoginAPI;
import com.bdjobs.logintest.Model.LoginData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    String userName="mybdjobs",password="mybdjobs12";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        LoginAPI.Factory.getInstance().getLoginData(userName, password).enqueue(new Callback<LoginData>() {
            @Override
            public void onResponse(Call<LoginData> call, Response<LoginData> response) {

                String name = response.body().getName();
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<LoginData> call, Throwable t) {

            }
        });


    }
}
