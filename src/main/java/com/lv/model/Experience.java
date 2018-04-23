package com.lv.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by xgq on 2018/4/20.
 */
@Component
public class Experience implements Serializable{//工作经历表
    private int exp_id;//工作经历id
    private String exp_company;//公司名称
    private String exp_in;//入职时间
    private String exp_out;//离职时间
    private String exp_post;//职位
    private String exp_trade;//所在行业
    private Resume resume;//和简历多对一

    public Experience() {
    }

    public int getExp_id() {
        return exp_id;
    }

    public void setExp_id(int exp_id) {
        this.exp_id = exp_id;
    }

    public String getExp_company() {
        return exp_company;
    }

    public void setExp_company(String exp_company) {
        this.exp_company = exp_company;
    }

    public String getExp_in() {
        return exp_in;
    }

    public void setExp_in(String exp_in) {
        this.exp_in = exp_in;
    }

    public String getExp_out() {
        return exp_out;
    }

    public void setExp_out(String exp_out) {
        this.exp_out = exp_out;
    }

    public String getExp_post() {
        return exp_post;
    }

    public void setExp_post(String exp_post) {
        this.exp_post = exp_post;
    }

    public String getExp_trade() {
        return exp_trade;
    }

    public void setExp_trade(String exp_trade) {
        this.exp_trade = exp_trade;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }
}
