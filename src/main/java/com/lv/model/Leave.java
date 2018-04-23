package com.lv.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by xgq on 2018/4/20.
 */
@Component
public class Leave implements Serializable {//离职表
    private int leave_id;//
    private String leave_date;//离职日期
    private String work_time;//在公司工作总时间(离职——入职)
    private String leave_reason;//离职原因
    private String leave_state;//状态,自离/开除
    private Employee employee;//对应的员工

    public Leave() {
    }

    public int getLeave_id() {
        return leave_id;
    }

    public void setLeave_id(int leave_id) {
        this.leave_id = leave_id;
    }

    public String getLeave_date() {
        return leave_date;
    }

    public void setLeave_date(String leave_date) {
        this.leave_date = leave_date;
    }

    public String getWork_time() {
        return work_time;
    }

    public void setWork_time(String work_time) {
        this.work_time = work_time;
    }

    public String getLeave_reason() {
        return leave_reason;
    }

    public void setLeave_reason(String leave_reason) {
        this.leave_reason = leave_reason;
    }

    public String getLeave_state() {
        return leave_state;
    }

    public void setLeave_state(String leave_state) {
        this.leave_state = leave_state;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "leave_id=" + leave_id +
                ", leave_date='" + leave_date + '\'' +
                ", work_time='" + work_time + '\'' +
                ", leave_reason='" + leave_reason + '\'' +
                ", leave_state='" + leave_state + '\'' +
                ", employee=" + employee +
                '}';
    }
}
