package com.bdjobs.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bdjobs.logintest.API.LoginAPI;
import com.bdjobs.logintest.Model.Job;
import com.bdjobs.logintest.Model.JobList;
import com.bdjobs.logintest.Model.LoginData;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    String userName,password;
    Button loginBTN;
    EditText  userNameET,passwordET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        userNameET = (EditText) findViewById(R.id.userNameET);
        passwordET= (EditText) findViewById(R.id.passwordET);
        loginBTN = (Button) findViewById(R.id.loginBTN);

        LoginAPI.Factory.getInstance().getJobs().enqueue(new Callback<JobList>() {
            @Override
            public void onResponse(Call<JobList> call, Response<JobList> response) {

                String jobID =response.body().getJobs().get(0).getJobid() ;
                Toast.makeText(MainActivity.this, jobID, Toast.LENGTH_SHORT).show();
                userNameET.setText(jobID);
            }

            @Override
            public void onFailure(Call<JobList> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
            }
        });





    }

    public void loginOncClick(View view)
    {
        userName = userNameET.getText().toString();
        password = passwordET.getText().toString();

        LoginAPI.Factory.getInstance().getLoginData(userName, password).enqueue(new Callback<LoginData>() {
            @Override
            public void onResponse(Call<LoginData> call, Response<LoginData> response) {

                String name = response.body().getMessage();
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();



            }

            @Override
            public void onFailure(Call<LoginData> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
