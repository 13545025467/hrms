package com.lv.service.impl;

import com.lv.dao.ExperienceMapper;
import com.lv.model.Experience;
import com.lv.model.Resume;
import com.lv.service.ExperienceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * Created by xgq on 2018/4/22.
 */
@Service
public class ExperienceServiceImpl implements ExperienceService {
   @Resource
   private ExperienceMapper experienceMapper;
    public Experience getExperience(Resume resume) {
        return experienceMapper.getExperience(resume);
    }

    public Set<Experience> getAll(Resume resume) {
        return experienceMapper.getAll(resume);
    }

    public boolean saveExperience(Experience experience) {
        experienceMapper.saveExperience(experience);
        return false;
    }

    public boolean deleteExperience(Resume resume) {
        experienceMapper.deleteExperience(resume);
        return false;
    }

    public boolean updateExperience(Experience experience) {
        experienceMapper.updateExperience(experience);
        return false;
    }
}
