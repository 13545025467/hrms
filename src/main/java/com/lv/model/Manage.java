package com.lv.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by xgq on 2018/4/20.
 */
@Component
public class Manage implements Serializable{//管理员
    private int man_id;//管理员id
    private String man_name;//账号
    private String man_pass;//密码

    public Manage() {
    }

    public Manage(String man_name, String man_pass) {
        this.man_name = man_name;
        this.man_pass = man_pass;
    }

    public int getMan_id() {
        return man_id;
    }

    public void setMan_id(int man_id) {
        this.man_id = man_id;
    }

    public String getMan_name() {
        return man_name;
    }

    public void setMan_name(String man_name) {
        this.man_name = man_name;
    }

    public String getMan_pass() {
        return man_pass;
    }

    public void setMan_pass(String man_pass) {
        this.man_pass = man_pass;
    }

    @Override
    public String toString() {
        return "Manage{" +
                "man_id=" + man_id +
                ", man_name='" + man_name + '\'' +
                ", man_pass='" + man_pass + '\'' +
                '}';
    }
}
