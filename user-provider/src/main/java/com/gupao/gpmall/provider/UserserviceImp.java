package com.gupao.gpmall.provider;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.gupao.gpmall.api.IUserService;
import com.gupao.gpmall.api.dto.*;
import com.gupao.gpmall.api.dto.common.Result;
import com.gupao.gpmall.api.dto.constants.ResponseCodeEnum;
import com.gupao.gpmall.dal.mapper.UserMapper;
import com.gupao.gpmall.dal.entity.User;
import com.gupao.gpmall.utils.JwtTokenUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

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

            Map<String,Object> map=new HashMap<>();
            map.put("uid",user.getId());
            map.put("exp", DateTime.now().plusSeconds(40).toDate().getTime()/1000);

            user.setAvatar(JwtTokenUtils.generatorToken(map));
        }catch (Exception e){
            logger.error("login occur exception :"+e);
            return Result.error("系統異常");
        }

        return  Result.success(user);
    }

    @Override
    public CheckAuthResponse validToken(CheckAuthRequest request) {
        CheckAuthResponse response=new CheckAuthResponse();
        try{

            Claims claims= JwtTokenUtils.phaseToken(request.getToken());
            response.setUid(claims.get("uid").toString());
            response.setCode(ResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(ResponseCodeEnum.SUCCESS.getMsg());

        }catch (ExpiredJwtException e){
            logger.error("Expire :"+e);
            response.setCode(ResponseCodeEnum.TOKEN_EXPIRE.getCode());
            response.setMsg(ResponseCodeEnum.TOKEN_EXPIRE.getMsg());
        }catch (SignatureException e1){
            logger.error("SignatureException :"+e1);
            response.setCode(ResponseCodeEnum.SIGNATURE_ERROR.getCode());
            response.setMsg(ResponseCodeEnum.SIGNATURE_ERROR.getMsg());
        }catch (Exception e){
            logger.error("login occur exception :"+e);
        }finally {
            logger.info("response:"+response);
        }

        return response;
    }

    @Override
    public UserRegisterResponse register(UserRegisterRequest userRegisterRequest) {
        return null;
    }

}
