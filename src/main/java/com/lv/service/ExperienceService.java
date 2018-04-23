package com.lv.service;

import com.lv.model.Experience;
import com.lv.model.Resume;

import java.util.Set;

/**
 * Created by xgq on 2018/4/22.
 */
public interface ExperienceService {
    Experience getExperience(Resume resume);//用户查询自己的简历
    Set<Experience> getAll(Resume resume);
    boolean saveExperience(Experience experience);
    boolean deleteExperience(Resume resume);
    boolean updateExperience(Experience experience);
}
