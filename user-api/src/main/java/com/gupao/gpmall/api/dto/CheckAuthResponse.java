package com.gupao.gpmall.api.dto;

import com.gupao.gpmall.api.dto.common.AbstractResponse;

/**
 * Created by 15995 on 2018/7/5.
 */
public class CheckAuthResponse extends AbstractResponse{

    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
