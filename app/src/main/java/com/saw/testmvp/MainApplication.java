package com.saw.testmvp;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by Saw on 2016/6/24 0024.
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
