package com.gupao.gpmall.api.dto;

import java.io.Serializable;

/**
 * Created by lixia on 2018/7/1.
 */
public class UserLoginRequest implements Serializable{
<<<<<<< HEAD

    private static final long serialVersionUID = 8900447065402159842L;
=======
>>>>>>> b7ae736dc5e276467895eb98b3ffb8f54c780046

    private static final long serialVersionUID = 7268914338550987080L;
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
