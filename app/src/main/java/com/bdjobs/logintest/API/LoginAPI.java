package com.bdjobs.logintest.API;

import com.bdjobs.logintest.Model.LoginData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Rubayet on 26-Apr-16.
 */
public interface LoginAPI {



    String baseURL = "http://my.bdjobs.com/";
    @FormUrlEncoded
    @POST("apps/mybdjobs/apps_agent_log.asp")
    Call<LoginData> getLoginData(@Field("username") String username, @Field("password") String password);

    class Factory {
        public static LoginAPI loginAPI;

        public static LoginAPI getInstance() {
            if (loginAPI == null) {
                Retrofit retrofit = new Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create())
                        .baseUrl(baseURL)
                        .build();

                loginAPI = retrofit.create(LoginAPI.class);
                return loginAPI;
            } else {
                return loginAPI;
            }
        }
    }

}
