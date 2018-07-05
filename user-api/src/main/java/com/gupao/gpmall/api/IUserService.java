package com.gupao.gpmall.api;

import com.gupao.gpmall.api.dto.*;
import com.gupao.gpmall.api.dto.common.Result;

/**
 * Created by lixia on 2018/7/1.
 */
public interface IUserService {

    Result userLogin(UserLoginRequest request);

    /**
     * 校验过程
     * @param request
     * @return
     */
    CheckAuthResponse validToken(CheckAuthRequest request);


    /*
     * 注册
     */
    UserRegisterResponse register(UserRegisterRequest userRegisterRequest);




}
