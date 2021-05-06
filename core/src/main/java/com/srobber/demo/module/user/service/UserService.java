package com.srobber.demo.module.user.service;

import com.srobber.demo.module.user.entity.UserEntity;

/**
 * 用户服务
 * @author chensenlai
 * 2021-04-29 下午3:27
 */
public interface UserService {

    /**
     * 查询用户信息
     * @param userId 用户编号
     * @return 用户信息
     */
    UserEntity getUser(long userId);
}
