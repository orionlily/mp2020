package com.orion.mp.service;

import com.orion.mp.entities.User;
import com.orion.mp.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author li.lc
 */
@Service("userService")
public class UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> getAllUsers(){
        return userMapper.selectList(null);
    }
}
