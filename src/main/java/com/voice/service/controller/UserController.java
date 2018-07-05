package com.voice.service.controller;

import com.voice.service.domain.dto.model.UserDto;
import com.voice.service.domain.service.user.IUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 * @author lufy
 * @ClassName com.voice.service.controller.UserController
 * @Description 用户模块
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource(name = "userService")
    private IUserService userService;

    /**
     * 添加用户
     * @param userDto
     * @return
     * @author
     */
    @RequestMapping(value = "regist", method = RequestMethod.POST)
    @ApiOperation(value = "添加用户", httpMethod = "POST", notes = "创建一个用户")
    public boolean Regist(@RequestBody UserDto userDto) {
        return userService.Add(userDto);
    }

    public boolean EmailRegist(@RequestBody UserDto userDto) {
        return false;
    }

    public boolean PhoneRegist(@RequestBody UserDto userDto) {
        return false;
    }
}
