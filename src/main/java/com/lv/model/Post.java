package com.lv.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by xgq on 2018/4/20.
 */
@Component
public class Post implements Serializable {//职位表
    private int post_id;//职位id
    private String post_title;//头衔
    private double post_sal;//基本工资
    private Dept dept;//归属部门

    public Post() {
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public double getPost_sal() {
        return post_sal;
    }

    public void setPost_sal(double post_sal) {
        this.post_sal = post_sal;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Post{" +
                "post_id=" + post_id +
                ", post_title='" + post_title + '\'' +
                ", post_sal=" + post_sal +
                ", dept=" + dept +
                '}';
    }
}
