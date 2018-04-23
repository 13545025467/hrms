package com.lv.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by xgq on 2018/4/20.
 */
@Component
public class Train implements Serializable{//培训表
    private int train_id;//
    private String train_date;//培训的时间
    private String train_local;//培训的地点
    private String train_context;//主题
    private String train_result;//结果，用于考试
    private Dept dept;//培训的对象是哪个部门
    private Employee employee;//或者培训的对象是具体哪个员工

    public Train() {
    }

    public int getTrain_id() {
        return train_id;
    }

    public void setTrain_id(int train_id) {
        this.train_id = train_id;
    }

    public String getTrain_date() {
        return train_date;
    }

    public void setTrain_date(String train_date) {
        this.train_date = train_date;
    }

    public String getTrain_local() {
        return train_local;
    }

    public void setTrain_local(String train_local) {
        this.train_local = train_local;
    }

    public String getTrain_context() {
        return train_context;
    }

    public void setTrain_context(String train_context) {
        this.train_context = train_context;
    }

    public String getTrain_result() {
        return train_result;
    }

    public void setTrain_result(String train_result) {
        this.train_result = train_result;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Train{" +
                "train_id=" + train_id +
                ", train_date='" + train_date + '\'' +
                ", train_local='" + train_local + '\'' +
                ", train_context='" + train_context + '\'' +
                ", train_result='" + train_result + '\'' +
                ", dept=" + dept +
                ", employee=" + employee +
                '}';
    }
}
