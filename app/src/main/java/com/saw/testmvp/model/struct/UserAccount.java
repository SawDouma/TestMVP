package com.saw.testmvp.model.struct;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Saw on 2016/6/24 0024.
 */
public class UserAccount implements Parcelable {
    @SerializedName("Balance")
    private double balance;
    @SerializedName("TotalSpending")
    private double totalSpending;
    @SerializedName("SurplusShareScore")
    private double surplusShareScore;
    @SerializedName("SurplusBackScore")
    private double surplusBackScore;
    @SerializedName("SurplusRechargeScore")
    private double surplusRechargeScore;

    protected UserAccount(Parcel in) {
        balance = in.readDouble();
        totalSpending = in.readDouble();
        surplusShareScore = in.readDouble();
        surplusBackScore = in.readDouble();
        surplusRechargeScore = in.readDouble();
    }

    public static final Creator<UserAccount> CREATOR = new Creator<UserAccount>() {
        @Override
        public UserAccount createFromParcel(Parcel in) {
            return new UserAccount(in);
        }

        @Override
        public UserAccount[] newArray(int size) {
            return new UserAccount[size];
        }
    };

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTotalSpending() {
        return totalSpending;
    }

    public void setTotalSpending(double totalSpending) {
        this.totalSpending = totalSpending;
    }

    public double getSurplusShareScore() {
        return surplusShareScore;
    }

    public void setSurplusShareScore(double surplusShareScore) {
        this.surplusShareScore = surplusShareScore;
    }

    public double getSurplusBackScore() {
        return surplusBackScore;
    }

    public void setSurplusBackScore(double surplusBackScore) {
        this.surplusBackScore = surplusBackScore;
    }

    public double getSurplusRechargeScore() {
        return surplusRechargeScore;
    }

    public void setSurplusRechargeScore(double surplusRechargeScore) {
        this.surplusRechargeScore = surplusRechargeScore;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(balance);
        dest.writeDouble(totalSpending);
        dest.writeDouble(surplusShareScore);
        dest.writeDouble(surplusBackScore);
        dest.writeDouble(surplusRechargeScore);
    }
}