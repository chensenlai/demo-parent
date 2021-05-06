package com.srobber.demo.module.user;

import com.srobber.common.result.JsonResult;
import com.srobber.demo.module.user.entity.UserEntity;
import com.srobber.demo.module.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 用户管理模块
 * @author chensenlai
 * 2021-04-30 下午3:28
 */
@Api(tags="用户管理")
@Slf4j
@Validated
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiIgnore
    @GetMapping("/get/v1")
    public JsonResult<UserEntity> getUserV1(@RequestParam("userId") @Range(message = "用户编号范围[1-10]",min = 1, max = 10) long userId) {
        UserEntity user = userService.getUser(userId);
        return JsonResult.ok(user);
    }

    @ApiOperation("查询用户信息")
    @GetMapping("/get/v2")
    public JsonResult<UserEntity> getUserV2(@ApiParam("用户编号") @RequestParam("userId") @Range(message = "用户编号范围[1-10]",min = 1, max = 10) long userId) {
        UserEntity user = userService.getUser(userId);
        return JsonResult.ok(user);
    }
}

