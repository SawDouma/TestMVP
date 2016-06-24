package com.saw.testmvp.presenter.impl;

import com.saw.testmvp.model.network.ApiFactory;
import com.saw.testmvp.model.struct.UserAccount;
import com.saw.testmvp.model.struct.UserSession;
import com.saw.testmvp.presenter.MainPresenter;
import com.saw.testmvp.view.MainView;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import timber.log.Timber;

/**
 * Created by Saw on 2016/6/24 0024.
 */
public class MainPresenterImpl implements MainPresenter {
    MainView mMainView;
    UserSession mUserSession;

    public MainPresenterImpl(MainView mainView) {
        mMainView = mainView;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void login(String phone, String imei) {
        ApiFactory.getApiLogin().login(phone, imei)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<UserSession>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        mMainView.onError();
                    }

                    @Override
                    public void onNext(UserSession userSession) {
                        mUserSession = userSession;
                        Timber.d(mUserSession.toString());
                        mMainView.onLogined();
                    }
                });
    }

    @Override
    public void getHappyPoints() {
        if (mUserSession == null) {
            mMainView.onError();
        } else {
            ApiFactory.getHappyPoints().getHappyPoints(2, mUserSession.getTokenCode())
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Subscriber<UserAccount>() {
                        @Override
                        public void onCompleted() {
                        }

                        @Override
                        public void onError(Throwable e) {
                            mMainView.onError();
                        }

                        @Override
                        public void onNext(UserAccount userAccount) {
                            mMainView.onGotHappyPoints(userAccount.getBalance());
                        }
                    });
        }
    }
}
