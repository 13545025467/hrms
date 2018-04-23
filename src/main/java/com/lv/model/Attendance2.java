package com.lv.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by xgq on 2018/4/20.
 */
@Component
public class Attendance2 implements Serializable {//考勤统计表
    private int att2_id;//
    private int att2_duty;//全勤天数
    private int att2_early;//早退次数
    private int att2_late;//迟到次数
    private int att2_absent;//旷工天数
    private int att2_vacate;//请假天数
    private Employee employee;//对应的员工

    public Attendance2() {
    }

    public int getAtt2_id() {
        return att2_id;
    }

    public void setAtt2_id(int att2_id) {
        this.att2_id = att2_id;
    }

    public int getAtt2_duty() {
        return att2_duty;
    }

    public void setAtt2_duty(int att2_duty) {
        this.att2_duty = att2_duty;
    }

    public int getAtt2_early() {
        return att2_early;
    }

    public void setAtt2_early(int att2_early) {
        this.att2_early = att2_early;
    }

    public int getAtt2_late() {
        return att2_late;
    }

    public void setAtt2_late(int att2_late) {
        this.att2_late = att2_late;
    }

    public int getAtt2_absent() {
        return att2_absent;
    }

    public void setAtt2_absent(int att2_absent) {
        this.att2_absent = att2_absent;
    }

    public int getAtt2_vacate() {
        return att2_vacate;
    }

    public void setAtt2_vacate(int att2_vacate) {
        this.att2_vacate = att2_vacate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Attendance2{" +
                "att2_id=" + att2_id +
                ", att2_duty=" + att2_duty +
                ", att2_early=" + att2_early +
                ", att2_late=" + att2_late +
                ", att2_absent=" + att2_absent +
                ", att2_vacate=" + att2_vacate +
                ", employee=" + employee +
                '}';
    }
}
