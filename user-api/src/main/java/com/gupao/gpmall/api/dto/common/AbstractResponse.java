package com.gupao.gpmall.api.dto.common;

import java.io.Serializable;

/**
 * Created by 15995 on 2018/7/5.
 */
public class AbstractResponse implements Serializable {
    private static final long serialVersionUID = 5451343280840090851L;
    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
