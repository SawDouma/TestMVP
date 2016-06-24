package com.saw.testmvp.view.ui;

import android.os.Bundle;
import android.widget.Toast;

import com.saw.testmvp.R;
import com.saw.testmvp.presenter.MainPresenter;
import com.saw.testmvp.presenter.impl.MainPresenterImpl;
import com.saw.testmvp.view.MainView;

import butterknife.ButterKnife;
import butterknife.OnClick;
import nucleus.view.NucleusAppCompatActivity;

public class MainActivity extends NucleusAppCompatActivity implements MainView{

    private MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mMainPresenter = new MainPresenterImpl(this);
        mMainPresenter.onCreate();
    }

    @OnClick(R.id.btnLogin)
    public void login(){
        mMainPresenter.login("13802240011", "869630010707101");
    }

    @OnClick(R.id.btnGetHappyPoints)
    public void getHappyPoints(){
        mMainPresenter.getHappyPoints();
    }

    @Override
    public void onLogined() {
        Toast.makeText(this, "Logined", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onGotHappyPoints(double str) {
        Toast.makeText(MainActivity.this, "Balance = " + str, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError() {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
    }
}
