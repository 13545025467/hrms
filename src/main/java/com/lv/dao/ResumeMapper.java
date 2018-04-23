package com.lv.dao;

import com.lv.model.Resume;
import com.lv.model.User;

import java.util.Set;

/**
 * Created by xgq on 2018/4/22.
 */
public interface ResumeMapper {
    Resume getResume(User user);//用户查询自己的简历
    Set<Resume> getAll(Resume resume);//管理员根据简历的状态查看，只能看已投递的简历
    boolean saveResume(Resume resume);
    boolean deleteResume(User user);
    boolean updateResume(Resume resume);
}
