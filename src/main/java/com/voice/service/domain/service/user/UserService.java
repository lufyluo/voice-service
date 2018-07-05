package com.voice.service.domain.service.user;

import com.voice.service.domain.dto.model.UserDto;
import com.voice.service.domain.repository.user.IUserRepo;
import com.voice.service.instructure.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService implements IUserService {
    @Autowired
    IUserRepo userRepo;
    @Override
    public boolean Add(UserDto userDto) {
        User user = userRepo.save(userDto.ToEntity());
        return user!=null;
    }
}
