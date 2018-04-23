package com.lv.model;

import java.io.Serializable;

/**
 * Created by xgq on 2018/4/20.
 */
public class Salary implements Serializable {//薪资表
    private int sal_id;//
    private int sal_basic;//基本工资
    private int sal_perfor;//绩效
    private int sal_overtime;//加班工资
    private int sal_reward;//奖惩工资
    private String sal_date;//时间，年月
    private Employee employee;//对应的员工

    public Salary() {
    }

    public int getSal_id() {
        return sal_id;
    }

    public void setSal_id(int sal_id) {
        this.sal_id = sal_id;
    }

    public int getSal_basic() {
        return sal_basic;
    }

    public void setSal_basic(int sal_basic) {
        this.sal_basic = sal_basic;
    }

    public int getSal_perfor() {
        return sal_perfor;
    }

    public void setSal_perfor(int sal_perfor) {
        this.sal_perfor = sal_perfor;
    }

    public int getSal_overtime() {
        return sal_overtime;
    }

    public void setSal_overtime(int sal_overtime) {
        this.sal_overtime = sal_overtime;
    }

    public int getSal_reward() {
        return sal_reward;
    }

    public void setSal_reward(int sal_reward) {
        this.sal_reward = sal_reward;
    }

    public String getSal_date() {
        return sal_date;
    }

    public void setSal_date(String sal_date) {
        this.sal_date = sal_date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "sal_id=" + sal_id +
                ", sal_basic=" + sal_basic +
                ", sal_perfor=" + sal_perfor +
                ", sal_overtime=" + sal_overtime +
                ", sal_reward=" + sal_reward +
                ", sal_date='" + sal_date + '\'' +
                ", employee=" + employee +
                '}';
    }
}
