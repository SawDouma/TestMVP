package com.saw.testmvp.model.struct;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Saw on 2016/6/24 0024.
 */
public class UserSession {
    @SerializedName("TokenCode")
    private String tokenCode = null;
    @SerializedName("Location")
    private String location = null;
    @SerializedName("UserId")
    private int userId = 0;
    @SerializedName("Phone")
    private String phone = null;
    @SerializedName("IMEI")
    private String IMEI = null;
    @SerializedName("IntroducerId")
    private String intorducerId = null;
    @SerializedName("IsLoginState")
    private boolean isLoginState = false;
    @SerializedName("NeedImproveInfo")
    private boolean needImproveInfo = false;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getIntorducerId() {
        return intorducerId;
    }

    public void setIntorducerId(String intorducerId) {
        this.intorducerId = intorducerId;
    }

    public boolean isLoginState() {
        return isLoginState;
    }

    public void setIsLoginState(boolean isLoginState) {
        this.isLoginState = isLoginState;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTokenCode() {
        return tokenCode;
    }

    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }

    public boolean isNeedImproveInfo() {
        return needImproveInfo;
    }

    public void setNeedImproveInfo(boolean needImproveInfo) {
        this.needImproveInfo = needImproveInfo;
    }

    public void clearSession() {
        this.tokenCode = null;
        this.location = null;
        this.userId = 0;
        this.IMEI = null;
        this.phone = null;
        this.intorducerId = null;
        this.isLoginState = false;
        this.needImproveInfo = false;
    }

    @Override
    public String toString() {
        return "UserSession{" +
                "tokenCode='" + tokenCode + '\'' +
                ", location='" + location + '\'' +
                ", userId=" + userId +
                ", phone='" + phone + '\'' +
                ", IMEI='" + IMEI + '\'' +
                ", intorducerId='" + intorducerId + '\'' +
                ", isLoginState=" + isLoginState +
                '}';
    }
}
