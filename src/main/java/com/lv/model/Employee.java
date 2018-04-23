package com.lv.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by xgq on 2018/4/20.
 */
@Component
public class Employee implements Serializable {//员工表
    private int emp_id;//员工id
    private String emp_name;//姓名
    private String emp_sex;//性别
    private int emp_age;//年龄
    private String work_num;//工号，用来登录
    private String emp_hiredate;///入职日期
    private String emp_tel;//电话
    private String emp_email;//邮箱
    private String emp_post;//职位
    private int dept_id;//部门
    private String emp_address;//地址
    private String emp_pass;
    private String emp_state;//状态，试用期，转正，离职，退休
    private Resume resume;//投递进来的简历对应这个员工（录用）

    public Employee() {
    }

    public Employee(String work_num, String emp_pass) {
        this.work_num = work_num;
        this.emp_pass = emp_pass;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_sex() {
        return emp_sex;
    }

    public void setEmp_sex(String emp_sex) {
        this.emp_sex = emp_sex;
    }

    public int getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(int emp_age) {
        this.emp_age = emp_age;
    }

    public String getWork_num() {
        return work_num;
    }

    public void setWork_num(String work_num) {
        this.work_num = work_num;
    }

    public String getEmp_hiredate() {
        return emp_hiredate;
    }

    public void setEmp_hiredate(String emp_hiredate) {
        this.emp_hiredate = emp_hiredate;
    }

    public String getEmp_tel() {
        return emp_tel;
    }

    public void setEmp_tel(String emp_tel) {
        this.emp_tel = emp_tel;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getEmp_post() {
        return emp_post;
    }

    public void setEmp_post(String emp_post) {
        this.emp_post = emp_post;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    public String getEmp_pass() {
        return emp_pass;
    }

    public void setEmp_pass(String emp_pass) {
        this.emp_pass = emp_pass;
    }

    public String getEmp_state() {
        return emp_state;
    }

    public void setEmp_state(String emp_state) {
        this.emp_state = emp_state;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_sex='" + emp_sex + '\'' +
                ", emp_age=" + emp_age +
                ", work_num='" + work_num + '\'' +
                ", emp_hiredate='" + emp_hiredate + '\'' +
                ", emp_tel='" + emp_tel + '\'' +
                ", emp_email='" + emp_email + '\'' +
                ", emp_post='" + emp_post + '\'' +
                ", dept_id=" + dept_id +
                ", emp_address='" + emp_address + '\'' +
                ", emp_pass='" + emp_pass + '\'' +
                ", emp_state='" + emp_state + '\'' +
                ", resume=" + resume +
                '}';
    }
}
