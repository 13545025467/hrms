package com.lv.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by xgq on 2018/4/20.
 */@Component
public class RAP implements Serializable {//奖惩表
    private int rap_id;//
    private String rap_date;//时间
    private double rap_money;//奖惩金额
    private String rap_reason;//原因
    private Employee employee;//对应的哪个员工

    public RAP() {
    }

    public int getRap_id() {
        return rap_id;
    }

    public void setRap_id(int rap_id) {
        this.rap_id = rap_id;
    }

    public String getRap_date() {
        return rap_date;
    }

    public void setRap_date(String rap_date) {
        this.rap_date = rap_date;
    }

    public double getRap_money() {
        return rap_money;
    }

    public void setRap_money(double rap_money) {
        this.rap_money = rap_money;
    }

    public String getRap_reason() {
        return rap_reason;
    }

    public void setRap_reason(String rap_reason) {
        this.rap_reason = rap_reason;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "RAP{" +
                "rap_id=" + rap_id +
                ", rap_date='" + rap_date + '\'' +
                ", rap_money=" + rap_money +
                ", rap_reason='" + rap_reason + '\'' +
                ", employee=" + employee +
                '}';
    }
}
