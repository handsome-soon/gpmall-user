package com.gupao.gpmall.api.dto;

import java.io.Serializable;

/**
 * Created by lixia on 2018/7/1.
 */
public class UserLoginRequest implements Serializable{

    private static final long serialVersionUID = 8900447065402159842L;

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
