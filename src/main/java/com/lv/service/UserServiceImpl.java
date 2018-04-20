package com.lv.service;

import com.lv.dao.UserMapper;
import com.lv.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xgq on 2018/4/20.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User login(User user) {
        return userMapper.login(user);
    }
}
