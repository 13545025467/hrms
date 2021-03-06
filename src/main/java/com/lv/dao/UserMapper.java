package com.lv.dao;

import com.lv.model.Manage;
import com.lv.model.User;

/**
 * Created by xgq on 2018/4/20.
 */
public interface UserMapper {
    User login(User user);
    User register(User user);
    User getUserById(User user);
    boolean save(User user);
    boolean updatePass(User user);
    Manage manageLogin(Manage manage);
}
