package com.gupao.gpmall.api;

import com.gupao.gpmall.api.dto.UserLoginRequest;
import com.gupao.gpmall.api.dto.UserLoginResponse;
import com.gupao.gpmall.api.dto.common.Result;

/**
 * Created by lixia on 2018/7/1.
 */
public interface IUserService {

    Result userLogin(UserLoginRequest request);


}
