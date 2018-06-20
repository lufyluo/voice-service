package com.voice.service.domain.service.user;

import com.voice.service.domain.dto.UserDto;

import javax.annotation.Resource;

public interface IUserService {
    boolean Add(UserDto userDto);
}
