package com.lv.service.impl;

import com.lv.dao.UserMapper;
import com.lv.model.Manage;
import com.lv.model.User;
import com.lv.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xgq on 2018/4/20.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public User login(User user) {
        return userMapper.login(user);
    }

    public User register(User user) {
        return userMapper.register(user);
    }

    public User getUserById(User user) {
        return userMapper.getUserById(user);
    }

    public boolean save(User user) {
        return userMapper.save(user);
    }

    public boolean updatePass(User user) {
        userMapper.updatePass(user);
        return false;
    }

    public Manage manageLogin(Manage manage) {
        return userMapper.manageLogin(manage);
    }
}
