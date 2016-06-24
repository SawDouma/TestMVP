package com.saw.testmvp.model.network.api;

import com.saw.testmvp.model.struct.UserSession;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Saw on 2016/6/24 0024.
 */
public interface ApiLogin {
    @FormUrlEncoded
    @POST("api/user/login")
    Observable<UserSession> login(@Field("Phone") String phone, @Field("IMEI") String imei);
}
