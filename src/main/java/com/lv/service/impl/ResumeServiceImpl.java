package com.lv.service.impl;

import com.lv.dao.ResumeMapper;
import com.lv.model.Resume;
import com.lv.model.User;
import com.lv.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * Created by xgq on 2018/4/22.
 */
@Service
public class ResumeServiceImpl implements ResumeService{
    @Resource
    private ResumeMapper resumeMapper;
    public Resume getResume(User user) {
        return resumeMapper.getResume(user);
    }

    public Set<Resume> getAll(Resume resume) {
        return resumeMapper.getAll(resume);
    }

    public Resume getResumeById(Resume resume) {
        return resumeMapper.getResumeById(resume);
    }

    public boolean saveResume(Resume resume) {
        resumeMapper.saveResume(resume);
        return false;
    }

    public boolean deleteResume(User user) {
        resumeMapper.deleteResume(user);
        return false;
    }

    public boolean updateResume(Resume resume) {
        resumeMapper.updateResume(resume) ;
        return false;
    }
}
