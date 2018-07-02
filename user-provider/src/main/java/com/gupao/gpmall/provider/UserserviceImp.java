package com.gupao.gpmall.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.gupao.gpmall.api.IUserService;
import com.gupao.gpmall.api.dto.UserLoginRequest;
import com.gupao.gpmall.api.dto.common.Result;
import com.gupao.gpmall.dal.mapper.UserMapper;
import com.gupao.gpmall.dal.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lixia on 2018/7/1.
 */
@Service
public class UserserviceImp implements IUserService {

    Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserMapper userMapper;


    @Override
    public Result userLogin(UserLoginRequest request) {
        logger.info("request -> "+  request);
        User user = null;
        try {
            user=userMapper.getUserByUserName(request.getUserName());
            if(user==null||!user.getPassword().equals(request.getPassword())){
                return Result.error("用戶名密碼不匹配");
            }

        }catch (Exception e){
            logger.error("login occur exception :"+e);
            return Result.error("系統異常");
        }

        return  Result.success(user);
    }
}
