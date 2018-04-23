package com.lv.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by xgq on 2018/4/20.
 */
@Component
public class Recruit  implements Serializable{//招聘表
    private int rec_id;//
    private String rec_job;//招聘的职位
    private int rec_count;//人数
    private String rec_local;//工作地点
    private String rec_education;///学历要求
    private String rec_beforejob;//工作经验要求
    private double rec_sal;//薪水福利
    private String rec_require;//工作需求
    private String rec_company;//公司名称
    private String rec_state;//状态，招聘中，已招满，不招了

    public Recruit() {
    }

    public Recruit(int rec_id, String rec_job, int rec_count, String rec_local, String rec_education, String rec_beforejob, double rec_sal, String rec_require, String rec_company, String rec_state) {
        this.rec_id = rec_id;
        this.rec_job = rec_job;
        this.rec_count = rec_count;
        this.rec_local = rec_local;
        this.rec_education = rec_education;
        this.rec_beforejob = rec_beforejob;
        this.rec_sal = rec_sal;
        this.rec_require = rec_require;
        this.rec_company = rec_company;
        this.rec_state = rec_state;
    }

    public int getRec_id() {
        return rec_id;
    }

    public void setRec_id(int rec_id) {
        this.rec_id = rec_id;
    }

    public String getRec_job() {
        return rec_job;
    }

    public void setRec_job(String rec_job) {
        this.rec_job = rec_job;
    }

    public int getRec_count() {
        return rec_count;
    }

    public void setRec_count(int rec_count) {
        this.rec_count = rec_count;
    }

    public String getRec_local() {
        return rec_local;
    }

    public void setRec_local(String rec_local) {
        this.rec_local = rec_local;
    }

    public String getRec_education() {
        return rec_education;
    }

    public void setRec_education(String rec_education) {
        this.rec_education = rec_education;
    }

    public String getRec_beforejob() {
        return rec_beforejob;
    }

    public void setRec_beforejob(String rec_beforejob) {
        this.rec_beforejob = rec_beforejob;
    }

    public double getRec_sal() {
        return rec_sal;
    }

    public void setRec_sal(double rec_sal) {
        this.rec_sal = rec_sal;
    }

    public String getRec_require() {
        return rec_require;
    }

    public void setRec_require(String rec_require) {
        this.rec_require = rec_require;
    }

    public String getRec_company() {
        return rec_company;
    }

    public void setRec_company(String rec_company) {
        this.rec_company = rec_company;
    }

    public String getRec_state() {
        return rec_state;
    }

    public void setRec_state(String rec_state) {
        this.rec_state = rec_state;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "rec_id=" + rec_id +
                ", rec_job='" + rec_job + '\'' +
                ", rec_count=" + rec_count +
                ", rec_local='" + rec_local + '\'' +
                ", rec_education='" + rec_education + '\'' +
                ", rec_beforejob='" + rec_beforejob + '\'' +
                ", rec_sal=" + rec_sal +
                ", rec_require='" + rec_require + '\'' +
                ", rec_company='" + rec_company + '\'' +
                ", rec_state='" + rec_state + '\'' +
                '}';
    }
}
