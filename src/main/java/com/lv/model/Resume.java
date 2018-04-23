package com.lv.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by xgq on 2018/4/20.
 */
@Component
public class Resume implements Serializable {//简历表
    private int res_id;//简历id
    private String res_name;//姓名
    private String res_sex;//性别
    private int res_age;//年龄
    private String res_tel;//电话
    private String res_email;//邮箱
    private String res_state;//状态、可用和不可用
    private User user;//和用户多对一

    public Resume() {
    }

    public int getRes_id() {
        return res_id;
    }

    public void setRes_id(int res_id) {
        this.res_id = res_id;
    }

    public String getRes_name() {
        return res_name;
    }

    public void setRes_name(String res_name) {
        this.res_name = res_name;
    }

    public String getRes_sex() {
        return res_sex;
    }

    public void setRes_sex(String res_sex) {
        this.res_sex = res_sex;
    }

    public int getRes_age() {
        return res_age;
    }

    public void setRes_age(int res_age) {
        this.res_age = res_age;
    }

    public String getRes_tel() {
        return res_tel;
    }

    public void setRes_tel(String res_tel) {
        this.res_tel = res_tel;
    }

    public String getRes_email() {
        return res_email;
    }

    public void setRes_email(String res_email) {
        this.res_email = res_email;
    }

    public String getRes_state() {
        return res_state;
    }

    public void setRes_state(String res_state) {
        this.res_state = res_state;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "res_id=" + res_id +
                ", res_name='" + res_name + '\'' +
                ", res_sex='" + res_sex + '\'' +
                ", res_age=" + res_age +
                ", res_tel='" + res_tel + '\'' +
                ", res_email='" + res_email + '\'' +
                ", res_state='" + res_state + '\'' +
                ", user=" + user +
                '}';
    }
}
