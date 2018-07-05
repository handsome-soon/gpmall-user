package com.gupao.gpmall.api.dto;

import java.io.Serializable;

/**
 * Created by 15995 on 2018/7/5.
 */
public class CheckAuthRequest implements Serializable{


    private static final long serialVersionUID = 6252645039717377365L;

    private  String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
