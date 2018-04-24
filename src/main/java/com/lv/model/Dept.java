package com.lv.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by xgq on 2018/4/20.
 */
@Component
public class Dept implements Serializable{//部门表
    private int dept_id;//部门id
    private String dept_name;//部门名称
    private String dept_createtime;

    public Dept() {
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDept_createtime() {
        return dept_createtime;
    }

    public void setDept_createtime(String dept_createtime) {
        this.dept_createtime = dept_createtime;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dept_id=" + dept_id +
                ", dept_name='" + dept_name + '\'' +
                ", dept_createtime='" + dept_createtime + '\'' +
                '}';
    }
}
