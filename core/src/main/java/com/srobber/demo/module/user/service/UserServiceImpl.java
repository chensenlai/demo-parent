package com.srobber.demo.module.user.service;

import com.srobber.common.enums.GenderEnum;
import com.srobber.common.util.DateUtil;
import com.srobber.demo.module.user.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 用户服务
 * @author chensenlai
 * 2021-04-29 下午3:27
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Value("${srobber.name}")
    private String name;

    @Override
    public UserEntity getUser(long userId) {
        UserEntity user = new UserEntity();
        user.setUserId(userId);
        user.setNickName(this.name+"_"+userId);
        user.setGender(GenderEnum.Male);
        user.setGmtCreated(DateUtil.now());
        user.setGtmUpdated(DateUtil.now());
        return user;
    }
}
