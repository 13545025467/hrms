package com.lv.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by xgq on 2018/4/20.
 */
@Component
public class User implements Serializable {//用户表
    private int user_id; //用户id
    private String user_name;//用户账号
    private String user_pass;//用户密码
   // private Set<Resume> resumes=new HashSet<>();//用户拥有多份简历


    public User() {
    }

    public User(String user_name, String user_pass) {
        this.user_name = user_name;
        this.user_pass = user_pass;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_pass='" + user_pass + '\'' +
                '}';
    }
}
