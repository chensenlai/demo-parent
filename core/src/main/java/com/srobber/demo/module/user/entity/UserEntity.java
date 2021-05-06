package com.srobber.demo.module.user.entity;

import com.srobber.common.entity.BaseEntity;
import com.srobber.common.enums.GenderEnum;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 用户实体
 * @author chensenlai
 * 2021-04-29 下午3:24
 */
@Data
@ToString
public class UserEntity implements BaseEntity {

    /**
     * 用户编号
     */
    private long userId;
    /**
     * 用户昵称
     */
    private String nickName;
    /**
     * 用户性别
     */
    private GenderEnum gender;
    /**
     * 创建时间
     */
    private Date gmtCreated;
    /**
     * 更新时间
     */
    private Date gtmUpdated;
}