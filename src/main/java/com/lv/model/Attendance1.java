package com.lv.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by xgq on 2018/4/20.
 */
@Component
public class Attendance1 implements Serializable {//考勤打卡表
    private int att_id;//
    private String att_on;//上班时间
    private String att_off;//下班时间
    private String att_date;///当日日期
    private Employee employee;//对应员工

    public Attendance1() {
    }

    public int getAtt_id() {
        return att_id;
    }

    public void setAtt_id(int att_id) {
        this.att_id = att_id;
    }

    public String getAtt_on() {
        return att_on;
    }

    public void setAtt_on(String att_on) {
        this.att_on = att_on;
    }

    public String getAtt_off() {
        return att_off;
    }

    public void setAtt_off(String att_off) {
        this.att_off = att_off;
    }

    public String getAtt_date() {
        return att_date;
    }

    public void setAtt_date(String att_date) {
        this.att_date = att_date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Attendance1{" +
                "att_id=" + att_id +
                ", att_on='" + att_on + '\'' +
                ", att_off='" + att_off + '\'' +
                ", att_date='" + att_date + '\'' +
                ", employee=" + employee +
                '}';
    }
}
