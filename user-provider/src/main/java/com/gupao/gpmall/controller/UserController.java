package com.gupao.gpmall.controller;

import com.gupao.gpmall.api.IUserService;
import com.gupao.gpmall.api.dto.UserLoginRequest;
import com.gupao.gpmall.api.dto.common.Result;
import com.gupao.gpmall.dto.LoginRequest;
//import com.gupao.gpmall.provider.UserserviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lixia on 2018/7/1.
 */

@RestController
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    UserserviceImp userService ;
//
//    @PostMapping("/login")
//    public Result login(@RequestBody LoginRequest req){
//            UserLoginRequest request = new UserLoginRequest();
//            request.setUserName(req.getUserName());
//            request.setPassword(req.getPassword());
//            return userService.userLogin(request);
//    }


}
