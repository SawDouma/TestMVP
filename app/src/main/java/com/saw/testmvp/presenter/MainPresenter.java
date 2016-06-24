package com.saw.testmvp.presenter;

/**
 * Created by Saw on 2016/6/24 0024.
 */
public interface MainPresenter {
    void onCreate();
    void login(String phone, String imei);
    void getHappyPoints();
}
