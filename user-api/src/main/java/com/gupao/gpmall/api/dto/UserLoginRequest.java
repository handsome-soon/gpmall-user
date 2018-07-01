package com.gupao.gpmall.api.dto;

/**
 * Created by lixia on 2018/7/1.
 */
public class UserLoginRequest {

    private  String userName;

    private  String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
