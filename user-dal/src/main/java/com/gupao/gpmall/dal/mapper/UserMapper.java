package com.gupao.gpmall.dal.mapper;

import com.gupao.gpmall.dal.entity.User;

/**
 * Created by lixia on 2018/7/1.
 */
public interface UserMapper {

    /**
     *
     * @return
     */
    User getUserByUserName(String userName);

}
