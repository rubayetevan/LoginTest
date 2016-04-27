package com.bdjobs.logintest.API;

import com.bdjobs.logintest.Model.JobList;
import com.bdjobs.logintest.Model.LoginData;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Rubayet on 26-Apr-16.
 */
public interface LoginAPI {



    //String baseURLlogin = "http://my.bdjobs.com/apps/";
    String baseURLjob = "http://jobs.bdjobs.com/apps/";

    @FormUrlEncoded
    @POST("mybdjobs/apps_agent_log.asp")
    Call<LoginData> getLoginData(@Field("username") String username, @Field("password") String password);

    @GET("joblist.asp?version=EN&pageid=20&isFirstRequest=1&encoded=JSBJ110415261")
    Call<JobList> getJobs();

    class Factory {
        public static LoginAPI loginAPI;

        public static LoginAPI getInstance() {
            if (loginAPI == null) {
                Retrofit retrofit = new Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create())
                        .baseUrl(baseURLjob)
                        .build();

                loginAPI = retrofit.create(LoginAPI.class);
                return loginAPI;
            } else {
                return loginAPI;
            }
        }
    }

}
