package com.saw.testmvp.model.network;

import com.saw.testmvp.model.network.api.ApiGetHappyPoints;
import com.saw.testmvp.model.network.api.ApiLogin;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Saw on 2016/6/24 0024.
 */
public class ApiFactory {
    private static final String USER_BASE_URL_DEBUG = "http://182.92.65.169:20080/";
    private static final String PRODUCT_BASE_URL_DEBUG = "http://182.92.65.169:20081/";

    private ApiFactory(){}

    public static ApiLogin getApiLogin(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(USER_BASE_URL_DEBUG)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return retrofit.create(ApiLogin.class);
    }

    public static ApiGetHappyPoints getHappyPoints(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PRODUCT_BASE_URL_DEBUG)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return retrofit.create(ApiGetHappyPoints.class);
    }


}
