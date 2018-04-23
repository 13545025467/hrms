package com.lv.dao;

import com.lv.model.Education;
import com.lv.model.Resume;
import com.lv.model.User;

import java.util.Set;

/**
 * Created by xgq on 2018/4/22.
 */
public interface EducationMapper {
    Education getEducation(Resume resume);//用户查询自己的简历
    Set<Education> getAll(Resume resume);
    boolean saveEducation(Education education);
    boolean deleteEducation(Resume resume);
    boolean updateEducation(Education education);
}
