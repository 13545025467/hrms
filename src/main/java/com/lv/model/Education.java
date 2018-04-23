package com.lv.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by xgq on 2018/4/20.
 */
@Component
public class Education implements Serializable{//教育背景对应简历
    private int edu_id;//教育背景id
    private String edu_school;//学校名称
    private String edu_degree;//学历学位
    private String edu_major;//专业
    private String edu_in;//入学时间
    private String edu_out;//毕业时间
    private Resume resume;//和简历多对一

    public Education() {
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public int getEdu_id() {
        return edu_id;
    }

    public void setEdu_id(int edu_id) {
        this.edu_id = edu_id;
    }

    public String getEdu_school() {
        return edu_school;
    }

    public void setEdu_school(String edu_school) {
        this.edu_school = edu_school;
    }

    public String getEdu_degree() {
        return edu_degree;
    }

    public void setEdu_degree(String edu_degree) {
        this.edu_degree = edu_degree;
    }

    public String getEdu_major() {
        return edu_major;
    }

    public void setEdu_major(String edu_major) {
        this.edu_major = edu_major;
    }

    public String getEdu_in() {
        return edu_in;
    }

    public void setEdu_in(String edu_in) {
        this.edu_in = edu_in;
    }

    public String getEdu_out() {
        return edu_out;
    }

    public void setEdu_out(String edu_out) {
        this.edu_out = edu_out;
    }

    @Override
    public String toString() {
        return "Education{" +
                "edu_id=" + edu_id +
                ", edu_school='" + edu_school + '\'' +
                ", edu_degree='" + edu_degree + '\'' +
                ", edu_major='" + edu_major + '\'' +
                ", edu_in='" + edu_in + '\'' +
                ", edu_out='" + edu_out + '\'' +
                ", resume=" + resume +
                '}';
    }
}
