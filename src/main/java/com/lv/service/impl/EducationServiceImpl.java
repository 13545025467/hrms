package com.lv.service.impl;

import com.lv.dao.EducationMapper;
import com.lv.model.Education;
import com.lv.model.Resume;
import com.lv.service.EducationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * Created by xgq on 2018/4/22.
 */
@Service
public class EducationServiceImpl implements EducationService {
    @Resource
    private EducationMapper educationMapper;
    public Education getEducation(Resume resume) {
        return educationMapper.getEducation(resume);
    }

    public Set<Education> getAll(Resume resume) {
        return educationMapper.getAll(resume);
    }

    public boolean saveEducation(Education education) {
        educationMapper.saveEducation(education);
        return false;
    }

    public boolean deleteEducation(Resume resume) {
        educationMapper.deleteEducation(resume);
        return false;
    }

    public boolean updateEducation(Education education) {
        educationMapper.updateEducation(education);
        return false;
    }
}
