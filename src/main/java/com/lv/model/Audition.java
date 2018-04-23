package com.lv.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by xgq on 2018/4/20.
 */
@Component
public class Audition implements Serializable {//面试邀请表
    private int audi_id;//
    private String audi_time;//面试时间
    private String audi_local;//面试地点
    private String audi_post;//面试的职位
    private String audi_tel;//公司联系电话
    private Resume resume;//对应简历信息，知道邀请的是谁
    private Recruit recruit;//对应招聘信息，知道招聘的职位和一些要求

    public Audition() {
    }

    public int getAudi_id() {
        return audi_id;
    }

    public void setAudi_id(int audi_id) {
        this.audi_id = audi_id;
    }

    public String getAudi_time() {
        return audi_time;
    }

    public void setAudi_time(String audi_time) {
        this.audi_time = audi_time;
    }

    public String getAudi_local() {
        return audi_local;
    }

    public void setAudi_local(String audi_local) {
        this.audi_local = audi_local;
    }

    public String getAudi_post() {
        return audi_post;
    }

    public void setAudi_post(String audi_post) {
        this.audi_post = audi_post;
    }

    public String getAudi_tel() {
        return audi_tel;
    }

    public void setAudi_tel(String audi_tel) {
        this.audi_tel = audi_tel;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public Recruit getRecruit() {
        return recruit;
    }

    public void setRecruit(Recruit recruit) {
        this.recruit = recruit;
    }

    @Override
    public String toString() {
        return "Audition{" +
                "audi_id=" + audi_id +
                ", audi_time='" + audi_time + '\'' +
                ", audi_local='" + audi_local + '\'' +
                ", audi_post='" + audi_post + '\'' +
                ", audi_tel='" + audi_tel + '\'' +
                ", resume=" + resume +
                ", recruit=" + recruit +
                '}';
    }
}
